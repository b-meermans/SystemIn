import java.io.InputStream;
import java.io.IOException;

public class CustomInputStream extends InputStream {
    private final StringBuilder buffer = new StringBuilder();
    private int position = 0;
    private boolean getRealResponse = false;

    @Override
    public int read() throws IOException {
        if (position >= buffer.length()) {
            // We need to fake an end of data response
            // Read is called until it runs out of data to read (or until some buffer limit)
            // But, we don't want to constantly be grabbing new data from users when read is called, we only
            // Want to call for a new response the first time position is equal to length,
            // the second time we want to say reading is over
            getRealResponse = !getRealResponse;
            if (getRealResponse) {
                fetchData();
            } else {
                return -1;
            }
        }

        return buffer.charAt(position++) & 0xFF;
    }

    private void fetchData() {
        String data = getSystemIn();

        if (data == null || data.isEmpty()) {
            data = "";
        }

        buffer.append(data + "\n");
    }

    public static native String getSystemIn();
}
