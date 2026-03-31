package lesson04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExPractice4_003 {
    public static void main(String[] args) {
        File file = new File("./src/lesson04/exam.txt");
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) { 
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 読み込んだ内容を表示
        for (String s : list) {
            System.out.println(s);
        }
    }
}