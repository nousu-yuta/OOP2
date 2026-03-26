package lesson03;

public class ExPractice3_003Sum {
    public void sum(int num, int addNum) {
        int sum = 0;
        while (num > 0) {
            sum += addNum;
            num--;
        }
        System.out.println("合計は" + sum + "です");
    }
}
