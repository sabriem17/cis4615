// Rule 13 - FIO08-J: Distinguish between characters or bytes read from a stream and -1
// A byte value can be mistaken for the end of the file.
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class R13_FIO08_J {
    public static int countBytes(InputStream input) throws IOException {
        int count = 0;
        byte value;
        while ((value = (byte) input.read()) != -1) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        byte[] data = {65, (byte) 0xff, 66};
        try (InputStream input = new ByteArrayInputStream(data)) {
            System.out.println("Bytes read: " + countBytes(input));
        }
    }
}
