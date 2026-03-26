// ReHero.java
package lesson09;

public class ReHero {
    String name;
    int hp;
    ReWeapon wp;

    public ReHero(String name, int hp, ReWeapon wp) {
        this.name = name;
        this.hp = hp;
        this.wp = wp;
    }

    public ReHero(String name, int hp) {
        this(name, hp, new ReWeapon());
    }

    public ReHero() {
        this("名無し勇者", 10, new ReWeapon());
    }

    public void dispInfo() {
        System.out.println("-----勇者生成-----");
        System.out.println("勇者名：" + this.name);
        System.out.println("hp：" + this.hp);
        System.out.println("武器名：" + this.wp.name);
        System.out.println("武器ダメージ：" + this.wp.damage);
    }

    public void attack(ReMatango enemy) {
        System.out.println(this.name + "の攻撃！");
        enemy.hp -= this.wp.damage;
        System.out.println(enemy.name + "に" + this.wp.damage + "ダメージ！");
    }

    public void escape() { // ← escape メソッドを追加
        System.out.println(this.name + "は逃げ出した！");
    }
}