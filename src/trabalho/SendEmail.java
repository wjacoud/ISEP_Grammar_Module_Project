package trabalho;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SendEmail {

    /**
     * Use Files class from Java 1.7 to write files, internally uses OutputStream
     *
     * @param data
     */
    public static void writeUsingFiles(String data, String dept) {
        try {
            Files.write(Paths.get("src/trabalho/emails/email_"+dept+".txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}