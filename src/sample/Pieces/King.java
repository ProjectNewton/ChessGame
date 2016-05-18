package sample.Pieces;

import sample.Game.Coordinate;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class King implements Piece{
    public static final int VALUE = 100;
    private boolean color;
    private Coordinate position;
    private Coordinate[] coordinates;

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
        return coordinates;
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
