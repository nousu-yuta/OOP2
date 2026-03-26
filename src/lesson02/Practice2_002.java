package lesson02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Practice2_002 {
    public static void main(String[] args) {
        int num1 = 15;
        System.out.println(num1 / 2);
        System.out.println(num1 % 2);
        System.out.println((double) num1 / 2);

        double num2 = 37;
        System.out.println(Math.round(num2 / 6));
        System.out.println(Math.ceil(num2 / 6));
        System.out.println(new BigDecimal(num2 / 6).setScale(2, RoundingMode.DOWN));

    }

}
