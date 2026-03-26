package lesson04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExPractice4_003 {
    public static void main(String[] args) {
        File file = new File("./src/lesson04/exam.txt"); // ← lesson04 に修正
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) { // ← FileReader を経由、try-with-resources で自動クローズ
            String line;
            while ((line = br.readLine()) != null) { // ← null チェックに修正
                list.add(line); // ← list に追加
            }
        } catch (IOException e) { // ← 例外処理を追加
            e.printStackTrace();
        }

        // 読み込んだ内容を表示
        for (String s : list) {
            System.out.println(s);
        }
    }
}