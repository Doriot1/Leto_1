package Monsters;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Goblin extends Monster{
    int melee = 3;
    public Goblin(){
        hp = 10;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int attack() {
        int hit = (int) (Math.random() * melee + 1);
        return hit;
    }
}
