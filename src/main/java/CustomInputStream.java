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
        String data = getSystemIn();

        if (data != null && !data.isEmpty()) {
            System.out.println(data);
            buffer.append(data + "\n\n");
        }
    }


//    private int dummyIndex = 0;
//    private String[] dummyData = {
//            "1234",
//            "3.14",
//            "true",
//            "hello",
//            "this is four inputs"
//    };
//    public String getSystemIn() {
//        if (dummyIndex < dummyData.length) {
//            return dummyData[dummyIndex++];
//        }
//        return "";
//
//    }



    public static native String getSystemIn();
}
