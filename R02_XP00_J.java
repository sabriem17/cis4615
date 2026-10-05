// Rule 02 - EXP00-J: Do not ignore values returned by methods
// The delete result is ignored.
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class R02_XP00_J {
    public static void deleteFile(File someFile) throws IOException {
        someFile.delete();
    }

    public static void main(String[] args) throws IOException {
        File someFile = Files.createTempFile("cert-delete-", ".txt").toFile();
        deleteFile(someFile);
        System.out.println("File still exists: " + someFile.exists());
    }
}
