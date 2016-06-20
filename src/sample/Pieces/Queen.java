package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Queen implements Piece{
    public static final int VALUE = 9;
    private boolean color;
    private Coordinate position;
    private ArrayList<Coordinate> coordinates;

    public Queen(int row, int col) {
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
        for (int rowNum=0; rowNum < Board.SIZE; rowNum++) {
            coordinates.add(new Coordinate(rowNum, col));
        }
        for (int colNum=0; colNum < Board.SIZE; colNum++) {
            coordinates.add(new Coordinate(row, colNum));
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
    public String toString() {return String.valueOf(QUEENstr);}
}
