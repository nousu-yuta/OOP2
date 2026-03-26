package lesson03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExPractice3_006 {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("点数を入力してください");
            try {
                num = new java.util.Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.print("整数を入力してください");
                continue;
            }
        }
        scan.close();

        ExPractice3_006Model model = new ExPractice3_006Model();
        model.setGrade(num);

        System.out.println("あなたは" + model.getGrade() + "です");
    }
}

class ExPractice3_006Model {
    private String grade;

    public void setGrade(int num) {
        if (num >= 90) {
            grade = "秀";
        } else if (num >= 80) {
            grade = "優";
        } else if (num >= 70) {
            grade = "良";
        } else if (num >= 60) {
            grade = "可";
        } else {
            grade = "不可";
        }
    }

    public String getGrade() {
        return grade;
    }
}

//getは結果、setは過程も
//ガチャでいうと、setは回して取って中身を空けてこれ、getは中身はこれ