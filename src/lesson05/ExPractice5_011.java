package lesson05;

public class ExPractice5_011 {
    public static void main(String[] args) {
        //文字列型
        HappyConvert<String> hp1 = new HappyConvert<>();
        hp1.setHappy("こんにちは");
        hp1.displayHappy();
        // 整数型のものを作成
        HappyConvert<Integer> hp2 = new HappyConvert<>();
        hp2.setHappy(10);
        hp2.displayHappy();
    }
}

class HappyConvert<T> {
    private T obj;

    public void setHappy(T obj) {
        //変数作成時に指定した型に格納
        this.obj = obj;
    }

    public void displayHappy() {
        if (obj instanceof Integer) {
            System.out.println("72 97 112 112 121 ");
            System.out.println("↑Happyの文字コード");
        } else if (obj instanceof String) {
            System.out.println("Happy!!");
        } else {
            System.out.println("Fall Happy");
        }
    }
}