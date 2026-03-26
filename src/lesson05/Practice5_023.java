package lesson05;

public class Practice5_023 {
    public static void main(String[] args) {
        int num = 0;
        if (args[0].matches("[+-]?\\d*(\\.\\d+)?")) {
            num = Integer.parseInt(args[0]);
        } else {
            System.out.println("コマンドライン辺スには数値を入力してください");
        }

        for (int i = 0; i < num; i++) {
            System.out.println("メイン処理！");
        }
    }
}
