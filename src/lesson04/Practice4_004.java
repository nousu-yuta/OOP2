package lesson04;

public class Practice4_004 {
    public static void main(String[] args) {
        System.out.print("繰り返し回数を入力してください：");
        int num = new java.util.Scanner(System.in).nextInt();
        int nums[] = new int[num];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("要素" + i + "の値：");
            nums[i] = new java.util.Scanner(System.in).nextInt();
        }
        System.out.println("配列の内容を表示します。");
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
