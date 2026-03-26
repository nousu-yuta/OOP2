package lesson01;

import java.math.BigDecimal;

public class Practice1_004 {

    public static void main(String[] args) {

        byte glasses = 1;
        System.out.println(glasses);

        short age = 20;
        System.out.println(age);

        int salary = 100;
        System.out.println(salary);

        long worldPeople = 1000;
        System.out.println(worldPeople);

        float weight = 5;
        System.out.println(weight);

        double pi = 5;
        System.out.println(pi);

        boolean isError = true;
        System.out.println(isError);

        char initial = 'a';
        System.out.println(initial);

        String name = "ho";
        System.out.println(name);

        int num[] = new int[4];
        System.out.println(num[1]);

        BigDecimal NUM1 = new BigDecimal("1");
        BigDecimal NUM2 = new BigDecimal("0.9");
        System.out.println("1+0.9=" + NUM1.add(NUM2));
        System.out.println("1-0.9=" + NUM1.subtract(NUM2));
        System.out.println("1*0.9=" + NUM1.multiply(NUM2));
        System.out.println("1-0.9= " + (1 - 0.9));
    }
}
