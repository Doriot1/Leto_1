package Classes;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Player {
    protected int melee;
    protected int special;
    protected int hp;
    protected int level;
    protected int MP;
    protected int exp;

    public int getHp() {
        return hp;
    }

    public int attack() {
        int hit = (int) (Math.random() * melee + 1);
        return hit;
    }

    public int special() {
        int hit = (int) (Math.random() * special + 1);
        return hit;
    }


}
