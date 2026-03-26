// Slime.java
package lesson09;

public class Slime {
    String name;
    int color;
    int hp;
    int pow;

    public Slime() {
        this.name = "スライム";
        this.color = 1;
        this.hp = 50;
        this.pow = 1;
    }

    public Slime(int hp, int pow) {
        this.name = "スライム";
        this.color = 1;
        this.hp = hp;
        this.pow = pow;
    }
}