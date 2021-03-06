package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Knight implements Piece{
    public static final int VALUE = 3;
    private boolean color;
    private Coordinate position;
    private ArrayList<Coordinate> coordinates;

    public Knight(int row, int col) {
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
    public ArrayList<Coordinate> getCoordinates() { return (ArrayList<Coordinate>) coordinates.clone(); }

    @Override
    public void setCoordinates() {
        if (coordinates != null) coordinates.clear();
        int row = position.getRow();
        int col = position.getCol();
        coordinates.add(new Coordinate(row+2, col+1));
        coordinates.add(new Coordinate(row+2, col-1));
        coordinates.add(new Coordinate(row+1, col+2));
        coordinates.add(new Coordinate(row+1, col-2));
        coordinates.add(new Coordinate(row-1, col-2));
        coordinates.add(new Coordinate(row-1, col+2));
        coordinates.add(new Coordinate(row-2, col+1));
        coordinates.add(new Coordinate(row-2, col-1));
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
    public String toString() {return String.valueOf(KNIGHTstr);}
}
