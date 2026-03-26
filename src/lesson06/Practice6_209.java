package lesson06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice6_209 {
    public static void main(String[] args) {
        String separator = System.getProperty("line.separator");

        try {
            File file = new File("C:\\Users\\hcs20\\OneDrive\\デスクトップ\\output.txt");

            if (file.exists() == false) {
                FileWriter filewriter = new FileWriter(file);

                filewriter.write("こんにちは");
                filewriter.write(separator);
                filewriter.write("お元気ですか");
                filewriter.write(separator);

                filewriter.flush();
                filewriter.close();
            } else {
                System.out.println("ファイルに書き込めません");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
