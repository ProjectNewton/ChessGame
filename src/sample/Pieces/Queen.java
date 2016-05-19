package sample.Pieces;

import sample.Game.Board;
import sample.Game.Coordinate;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Queen implements Piece{
    public static final int VALUE = 9;
    private boolean color;
    private Coordinate position;
    private Coordinate[] coordinates;

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
    public Coordinate[] getCoordinates() {
        return coordinates.clone();
    }

    @Override
    public void setCoordinates() {
    }

    @Override
    public Coordinate getPosition() {
        return position;
    }

    @Override
    public void setPosition(int row, int col) {
        position.setRow(row);
        position.setCol(col);
    }
}
