// Rule 00 - IDS03-J: Do not log unsanitized user input
// Check the username before logging it.
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static void logLogin(Logger logger, String username, boolean loginSuccessful) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        if (username != null && Pattern.matches("[A-Za-z0-9]+", username)) {
            return username;
        }
        return "unauthorized user";
    }

    public static void main(String[] args) {
        String username = "guest\nUser login succeeded for: administrator";
        logLogin(Logger.getLogger("login"), username, false);
    }
}
