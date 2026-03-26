package lesson09;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = "コンストラクタなし";
        this.age = 20;
        dispinfo();
    }

    public Person(String name) {
        this.name = name;
        this.age = 15;
        dispinfo();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        dispinfo();
    }

    public void dispinfo() {
        System.out.println("名前：" + this.name);
        System.out.println("年齢：" + this.age);
    }
}
