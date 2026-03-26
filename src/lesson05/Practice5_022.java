package lesson05;

public class Practice5_022 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("おはようございます。");
                break;
            case "2":
                System.out.println("こんにちは。");
                break;
            case "3":
                System.out.println("こんばんは。");
                break;
            case "4":
                System.out.println("おやすみなさい。");
                break;
            case "5":
                System.out.println("HELLO");
                break;
            default:
                System.out.println("コマンドライン引数に１～５を入力してください。");
                break;
        }
    }
}
