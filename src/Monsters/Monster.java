package Monsters;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Monster {
    protected int hp;
    protected int melee;

    public int getHp(){
        return hp;
    }

    public int attack(){
        int hit = (int) (Math.random() * melee + 1);
        return hit;
    }
}
