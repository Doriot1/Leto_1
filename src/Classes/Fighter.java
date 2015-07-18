package Classes;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Fighter extends Player {
    int melee = 8;


    public Fighter() {
        hp = 12;
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
}
