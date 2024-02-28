import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CustomInputStream extends InputStream {
    private byte[] buffer = new byte[0]; // Buffer for incoming data
    private int position = 0; // Current position in the buffer

    public CustomInputStream() {
        super();
    }

    // Synchronized method to safely append new data from the native method
    private synchronized void fetchDataIfNeeded() {
        if (position >= buffer.length) { // Check if all current data has been read
            String newData = getSystemIn() + "\n"; // Fetch new data (this method blocks until new data is available)
            if (newData != null && !newData.isEmpty()) {
                buffer = newData.getBytes(StandardCharsets.UTF_8); // Reset buffer with new data
                position = 0; // Reset position
            }
        }
    }

    @Override
    public synchronized int read() throws IOException {
        fetchDataIfNeeded(); // Check for and fetch new data if needed
        if (position < buffer.length) {
            return buffer[position++] & 0xFF; // Return next byte of data
        } else {
            return -1; // End of stream (if no new data was fetched)
        }
    }


    /**
     * Gets input from the front end.
     * Note: Grabbing this data as a String, but could adjust to a byte[]
     * @return the typed in content
     */
    public static native String getSystemIn();
}