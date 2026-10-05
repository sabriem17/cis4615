// Rule 04 - STR03-J: Do not encode noncharacter data as a string
// Turning number bytes into text can change the number.
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class R04_STR03_J {
    public static BigInteger roundTrip(BigInteger x) {
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray, StandardCharsets.UTF_8);
        byteArray = s.getBytes(StandardCharsets.UTF_8);
        return new BigInteger(byteArray);
    }

    public static void main(String[] args) {
        BigInteger x = new BigInteger("530500452766");
        System.out.println("Original: " + x);
        System.out.println("Restored: " + roundTrip(x));
    }
}
