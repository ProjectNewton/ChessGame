package sample.Players;

import sample.Game.Board;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/15/2016.
 */
public interface Player {
    ArrayList<Boolean> colorArr = new ArrayList<>(2);
    Board play(Board board);
}
