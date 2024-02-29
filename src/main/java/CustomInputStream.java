import java.io.InputStream;
import java.io.IOException;

public class CustomInputStream extends InputStream {
    private final StringBuilder buffer = new StringBuilder();
    private int position = 0;

    @Override
    public int read() throws IOException {
        if (position >= buffer.length()) {
            fetchData();
        }

        if (position >= buffer.length()) {
            return -1;
        }

        return buffer.charAt(position++) & 0xFF;
    }

    private void fetchData() {
        String data = getSystemIn();

        if (data != null && !data.isEmpty()) {
            buffer.append(data + "\n");
        }
    }

    public static native String getSystemIn();
}
