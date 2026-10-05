// Rule 00 - IDS03-J: Do not log unsanitized user input
// The username can add a fake log message.
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void logLogin(Logger logger, String username, boolean loginSuccessful) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }

    public static void main(String[] args) {
        String username = "guest\nUser login succeeded for: administrator";
        logLogin(Logger.getLogger("login"), username, false);
    }
}
