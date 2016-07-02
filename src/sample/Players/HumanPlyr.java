package sample.Players;

import com.sun.org.apache.xpath.internal.SourceTree;
import sample.Game.Board;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Rohan D'Souza on 5/27/2016.
 */
public class HumanPlyr implements Player{
    private static Scanner sc = new Scanner(System.in);
    private boolean color;

    public HumanPlyr() {
        this.color = setColor();
        if (color) System.out.println("You will be the top player with upper case letters.");
        else System.out.println("You will be the bottom player with lower case letters.");
    }

    public boolean setColor() {

        String color = "";
        while (!color.equals("white") && !color.equals("black")) {
            System.out.println("What color would you like to be?\nPlease enter \"white\" or \"black\".");
            //while (!sc.hasNextLine()) {
            //    System.out.println("That's not a word!");
            //    sc.next();
            //}
            color = sc.nextLine();
        }
        return color.equals("white");
    }

    @Override
    public Board play(Board board) {
        return null;
    }
}
