// Rule 06 - MET01-J: Never use assertions to validate method arguments
// Use if statements to check the inputs.
public class R06_MET01_J {
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Invalid number");
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Sum is too large");
        }
        return absX + absY;
    }

    public static void main(String[] args) {
        System.out.println(getAbsAdd(-4, 5));
    }
}
