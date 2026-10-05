// Rule 49 - MSC02-J: Generate strong random numbers
// The same seed gives the same random number.
import java.util.Random;

public class R49_MSC02_J {
    public static int getNumber() {
        Random random = new Random(123L);
        return random.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(getNumber());
        System.out.println(getNumber());
    }
}
