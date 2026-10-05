// Rule 05 - OBJ05-J: Do not return references to private mutable class members
// The returned Date can change the private date.
import java.util.Date;

public class R05_OBJ05_J {
    private final Date date = new Date(1000L);

    public Date getDate() {
        return date;
    }

    public static void main(String[] args) {
        R05_OBJ05_J record = new R05_OBJ05_J();
        record.getDate().setTime(0L);
        System.out.println("Internal date in milliseconds: " + record.getDate().getTime());
    }
}
