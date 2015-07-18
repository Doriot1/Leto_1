package Classes;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Wizard extends Player {
    int melee = 4;
    int special = 8;

    public Wizard() {
        hp = 6;
        MP = 20;
        level = 1;
        exp = 0;
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int attack() {
        int hit = (int) (Math.random() * melee + 1);
        return hit;
    }

    @Override
    public int special() {
        int hit = (int) (Math.random() * special + 1);
        return hit;
    }
}
