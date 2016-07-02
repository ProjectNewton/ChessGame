package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Bishop implements Piece{
    public static final int VALUE = 3;
    private boolean color;
    private Coordinate position;
    private ArrayList<Coordinate> coordinates;

    public Bishop(int row, int col) {
        color = row < Board.SIZE/2;
        position = new Coordinate(row,col);
        coordinates = new ArrayList<>();
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
    public ArrayList<Coordinate> getCoordinates() {
        return (ArrayList<Coordinate>) coordinates.clone();
    }

    @Override
    public void setCoordinates() {
        if (coordinates != null) coordinates.clear();
        int row = position.getRow();
        int col = position.getCol();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        while (row+c1 < 8 && col+c1 < 8) {
            c1++;
            coordinates.add(new Coordinate(row+c1, col+c1));
        }
        while (row+c2 < 8 && col-c2 >= 0) {
            c2++;
            coordinates.add(new Coordinate(row+c2, col-c2));
        }
        while (row-c3 >= 0 && col+c3 < 8) {
            c3++;
            coordinates.add(new Coordinate(row-c3, col+c3));
        }
        while (row-c4 >= 0 && col-c4 >= 0) {
            c4++;
            coordinates.add(new Coordinate(row-c4, col-c4));
        }
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
    public String toString() {return String.valueOf(BISHOPstr);}
}
