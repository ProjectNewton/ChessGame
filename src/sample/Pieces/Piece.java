package sample.Pieces;

import sample.Game.Coordinate;

/**
 * Created by Rohan D'Souza on 5/14/2016.
 */
public interface Piece {
    boolean getColor();
    void setColor(boolean color);
    Coordinate[] getCoordinates();
    void setCoordinates();
    Coordinate getPosition();
    void setPosition(int row, int col);
}
