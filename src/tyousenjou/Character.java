package tyousenjou;

public class Character {
    String name, role;
    int atk, def, hp, mp;

    public Character(String name, String role, int atk, int def, int hp, int mp) {
        this.name = name;
        this.role = role;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.mp = mp;

        System.out.println("氏名：" + name + "役職：" + role + "攻撃力：" + atk + "防御力：" + def + "体力：" + hp + "魔力：" + mp);

    }

    public void synergy(Character other) {
        if (this.role.equals(other.role)) {
            System.out.println(this.name + "と" + other.name + "は同じ役職【" + this.role + "】なのでシナジーあり！");
        } else {
            System.out.println(this.name + "と" + other.name + "はシナジーなし");
        }
    }
}

//シナジー判定の引数は氏名ではなく役職
