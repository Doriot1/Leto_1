import Classes.Player;
import Initializers.GetClass;
import Monsters.Goblin;
import Monsters.Monster;
import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * Created by Daniel on 11.7.2015.
 */
public class Home {

    public static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        Monster goblin1;
        Player player;
        goblin1 = new Goblin();

        player = GetClass.getCharacter(userInput);

        game();

        if (encounter(goblin1, player))
            System.out.println("playerwins");

        userInput.close();
    }

    public static boolean encounter(Monster monster, Player player) {
        boolean playerwins;
        int monsterhp = monster.getHp();
        int playerhp = player.getHp();

        while (true) {
            if (monsterhp <= 0) {
                System.out.println("Goblin has been killed. Congratz!");
                playerwins = true;
                break;
            } else if (playerhp <= 0) {
                System.out.println("Game is over, you have been killed. gg");
                playerwins = false;
                break;
            }

            String command = userInput.nextLine();

            if (command.equals("attack"))
                monsterhp = monsterhp - player.attack();
            else if (command.equals("special"))
                monsterhp = monsterhp - player.special();

            playerhp = playerhp - monster.attack();
            System.out.println("MonsterHP: " + monsterhp + "  playerHP: " + playerhp);
            // System.out.println("For melee swing, press 1");
        }

        return playerwins;
    }

    public static void game() {

    }
}
