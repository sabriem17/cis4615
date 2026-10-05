// Rule 03 - NUM03-J: Use integer types that can fully represent the possible range of unsigned data
// Use a long for the unsigned number.
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static long getInteger(DataInputStream input) throws IOException {
        return input.readInt() & 0xFFFFFFFFL;
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        try (DataInputStream input = new DataInputStream(new ByteArrayInputStream(bytes))) {
            System.out.println("Unsigned value: " + getInteger(input));
        }
    }
}
