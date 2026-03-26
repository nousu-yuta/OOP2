package lesson07;

public class Practice7_001Main {
    public void execute() {
        int num1 = 24;
        int num2 = 10;

        Practice7_001Output.introduction();

        int ans = Practice7_001Logic.add(num1, num2);
        Practice7_001Output.outputStrNum("足し算：", ans);

        ans = Practice7_001Logic.sub(num1, num2);
        Practice7_001Output.outputStrNum("引き算：", ans);

        int rounded = Practice7_001Logic.roundDown((float) num1 / num2);
        Practice7_001Output.outputStrNum("切り捨て：", rounded);

    }
}
