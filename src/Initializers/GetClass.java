package Initializers;

import Classes.Fighter;
import Classes.Player;
import Classes.Wizard;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Daniel on 12.7.2015.
 */
public class GetClass {

    //private static Scanner userInput = new Scanner(System.in);
    private static Player y;

    public static Player getCharacter(Scanner x) {
        int choice = getChoice(x);

        if (choice == 1)
            y = new Wizard();
        else if (choice == 2)
            y = new Fighter();
        else
            getCharacter(x);

        x.nextLine();
        return y;
    }


    private static int getChoice(Scanner x) {
        System.out.println("Press 1 to play wizard or 2 to play fighter.");
        try {
            return x.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have entered something else than a whole number.");
            x = new Scanner(System.in);
        }
        return 0;
    }
}