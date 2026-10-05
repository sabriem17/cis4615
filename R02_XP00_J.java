// Rule 02 - EXP00-J: Do not ignore values returned by methods
// Check whether the file was deleted.
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class R02_XP00_J {
    public static void deleteFile(File someFile) throws IOException {
        if (!someFile.delete()) {
            throw new IOException("File could not be deleted");
        }
    }

    public static void main(String[] args) throws IOException {
        File someFile = Files.createTempFile("cert-delete-", ".txt").toFile();
        deleteFile(someFile);
        System.out.println("File still exists: " + someFile.exists());
    }
}
