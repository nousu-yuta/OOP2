// ReMain.java
package lesson09;

public class ReMain {
    public static void main(String[] args) {
        ReHero rh = new ReHero("勇者", 100, new ReWeapon("剣", 20)); // ← インスタンスを定義
        ReMatango rm = new ReMatango("マタンゴ", 30, 8);

        rh.dispInfo();
        rm.dispInfo();
        System.err.println("-----戦闘開始-----");
        rh.attack(rm);
        rm.attack(rh);
        rh.escape();
        System.out.println("-----戦闘終了-----");
    }
}