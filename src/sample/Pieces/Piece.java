package sample.Pieces;

/**
 * Created by Rohan D'Souza on 5/14/2016.
 */
public interface Piece {
    int PAWN = 1;
    int KNIGHT = 3;
    int BISHOP = 3;
    int ROOK = 5;
    int QUEEN = 9;
    //int KING = 100;
    boolean getColor();
    void setColor();
}
