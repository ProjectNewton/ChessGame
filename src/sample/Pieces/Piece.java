package sample.Pieces;

import sample.Game.Coordinate;

import java.util.ArrayList;

/**
 * Created by Rohan D'Souza on 5/14/2016.
 */
public interface Piece {
    public static char KINGstr = 'k';
    public static char QUEENstr = 'q';
    public static char BISHOPstr = 'b';
    public static char KNIGHTstr = 'h';
    public static char ROOKstr = 'r';
    public static char PAWNstr = 'p';

    boolean getColor();
    void setColor(boolean color);
    ArrayList<Coordinate> getCoordinates();
    void setCoordinates();
    Coordinate getPosition();
    void setPosition(int row, int col);

    default public String display() {
        return getColor() ? toString().toUpperCase() : toString();
    }
}
