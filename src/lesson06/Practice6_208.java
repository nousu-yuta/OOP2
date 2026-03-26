package lesson06;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class Practice6_208 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\hcs20\\OneDrive\\デスクトップ\\text.txt");

            if (file.exists() == true) {
                FileReader fileReader = new FileReader(file);

                int data;
                while ((data = fileReader.read()) != -1) {
                    System.out.println((char) data);
                }

                fileReader.close();
            } else {
                System.out.println("ファイルを読み込めません");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
