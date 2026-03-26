package lesson04;

public class Practice4_003 {
    public static void main(String[] args) {
        String[] kamoku = { "国語", "算数", "理科", "社会" };
        int[] tensu = new int[kamoku.length];
        String[] saisi = new String[kamoku.length];
        int sum = 0;
        int ave = 0;
        int j = 0;
        for (int i = 0; i < kamoku.length; i++) {
            System.out.print(kamoku[i] + "の点数を入力してください：");
            tensu[i] = new java.util.Scanner(System.in).nextInt();
            sum += tensu[i];
            if (tensu[i] < 60) {
                saisi[j] = kamoku[i];
                j++;
            }
        }

        ave = sum / tensu.length;
        System.out.println("合計は" + sum + "点です");
        System.out.println("平均は" + ave + "点です");
        if (j > 0) {
            System.out.print("あなたは右記の科目で再試があります。[");
            for (j = 0; j < saisi.length; j++) {
                System.out.print(saisi[j]);
                if (saisi[j + 1] == null) {
                    break;
                } else {
                    System.out.print("、");
                }
            }
            System.out.println("]");
        }
        System.out.println(saisi.length);

    }
}
