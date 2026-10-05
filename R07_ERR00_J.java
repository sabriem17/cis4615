// Rule 07 - ERR00-J: Do not suppress or ignore checked exceptions
// The file error is ignored.
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class R07_ERR00_J {
    public static String readConfig(Path path) throws IOException {
        try {
            return Files.readString(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "";
        }
    }

    public static void main(String[] args) {
        try {
            String config = readConfig(Path.of("config.txt"));
            System.out.println("Config: " + config);
        } catch (IOException e) {
            System.out.println("Could not read the config file");
        }
    }
}
