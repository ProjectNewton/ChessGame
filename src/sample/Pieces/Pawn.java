package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;
import sample.Main;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Pawn implements Piece{
    public static final int VALUE = 1;
    private boolean color;
    private Coordinate position;
    private ArrayList<Coordinate> coordinates;


    /**
     * determine which direction is forward for the pawn.
     */
    private int forward = (color) ? 1 : -1;

    public Pawn(int row, int col) {
        color = row < Board.SIZE/2;
        position = new Coordinate(row,col);
        setCoordinates();
    }

    @Override
    public boolean getColor() {
        return color;
    }

    @Override
    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public ArrayList<Coordinate> getCoordinates() { return (ArrayList<Coordinate>) coordinates.clone(); }

    @Override
    public void setCoordinates() {
        coordinates.clear();
        int row = position.getRow();
        int col = position.getCol();
        Coordinate coor = new Coordinate(row+2*forward,col);
        if(Main.round == 1)
            coordinates.add(coor);
        coordinates.add(new Coordinate(row+forward,col));
    }

    @Override
    public Coordinate getPosition() {
        return position;
    }

    @Override
    public void setPosition(int row, int col) {
        position.setRow(row);
        position.setCol(col);
        setCoordinates();
    }

    @Override
    public String toString() {return String.valueOf(PAWNstr);}
}
