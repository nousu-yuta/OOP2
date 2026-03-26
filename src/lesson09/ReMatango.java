// ReMatango.java
package lesson09;

public class ReMatango {
    String name;
    int hp;
    int pow;

    public ReMatango(String name, int hp, int pow) {
        this.name = name;
        this.hp = hp;
        this.pow = pow;
    }

    public ReMatango() {
        this("マタンゴ", 30, 8);
    }

    public void dispInfo() {
        System.out.println("-----モンスター生成-----");
        System.out.println("モンスター名：" + this.name);
        System.out.println("hp：" + this.hp);
    }

    public void attack(ReHero hero) {
        System.out.println(this.name + "の攻撃！");
        hero.hp -= this.pow;
        System.out.println(hero.name + "に" + this.pow + "ダメージ！");
    }
}