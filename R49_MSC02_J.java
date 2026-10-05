// Rule 49 - MSC02-J: Generate strong random numbers
// Use SecureRandom for the random number.
import java.security.SecureRandom;

public class R49_MSC02_J {
    public static int getNumber() {
        SecureRandom random = new SecureRandom();
        return random.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
        System.out.println(getNumber());
    }
}
