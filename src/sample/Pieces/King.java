package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class King implements Piece{
    public static final int VALUE = 100;
    private boolean color;
    private Coordinate position;
    private ArrayList<Coordinate> coordinates;

    public King(int row, int col) {
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
        coordinates.add(new Coordinate(row+1, col));
        coordinates.add(new Coordinate(row-1,col));
        coordinates.add(new Coordinate(row,col+1));
        coordinates.add(new Coordinate(row,col-1));

        coordinates.add(new Coordinate(row+1,col+1));
        coordinates.add(new Coordinate(row+1,col-1));
        coordinates.add(new Coordinate(row-1,col+1));
        coordinates.add(new Coordinate(row-1,col-1));
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
}
