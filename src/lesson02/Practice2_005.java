package lesson02;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Practice2_005 {
    public static void main(String[] args) {
        String str1 = "こんにちは。";
        String str2 = "お元気ですか？";
        System.out.print(str1);
        System.out.println(str2);

        Random rand = new Random();
        int num1 = rand.nextInt(100);
        System.out.println(num1);
        int num2 = rand.nextInt(100);
        System.out.println(num2);
        if (num1 > num2) {
            System.out.println("大きい方は" + num1 + "です。");
        } else {
            System.out.println("大きい方は" + num2 + "です。");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください：");
        String str3 = scanner.nextLine();
        int num3 = Integer.parseInt(str3);
        System.out.println(num3);

        System.out.print("金額を入力してください：");

        int num4 = 0; // ← ループの外で宣言
        while (true) {
            try {
                num4 = scanner.nextInt(); // ← 代入のみ
                break; // ← 正常入力できたらループを抜ける
            } catch (InputMismatchException e) { // ← 変数名を e に変更
                scanner.nextLine(); // ← バッファをクリア
                System.out.print("整数値でもう一度入力してください：");
            }
        }
        System.out.println(num4);
        NumberFormat num5 = NumberFormat.getNumberInstance();
        System.out.println(num5.format(num5));
    }
}
