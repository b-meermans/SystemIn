import java.io.InputStream;
import java.io.IOException;

public class CustomInputStream extends InputStream {
    private StringBuilder buffer = new StringBuilder();
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
        String newData = String.valueOf(getSystemIn()) + "\n";

        System.out.println(newData);
        if (newData != null && !newData.isEmpty()) {
            buffer.append(newData);
        }
    }

//    public String getSystemIn() {
//        return String.valueOf((int) (Math.random() * 5000));
//    }



    public static native String getSystemIn();
}
