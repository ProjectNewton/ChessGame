package sample;


import sample.Players.Player;

/**
 * Created by Rohan D'Souza on 5/13/2016.
 */
public class Board {
    private static final String fill = " ";
    /**
     * <p>  This is a 2 dimensional array of <code>booleans</code> that is used in
     *      parallel to the 2 dimensional array <code>Board</code>.</p>
     *      <p>The value of each boolean represents the color of each square.
     *          <ul>
     *              <li>True  :means that the color of the <code>Piece</code> is white.</li>
     *              <li>False :means that the color of the <code>Piece</code> is black.</li>
     *          </ul>
     *      </p>
     */
    private boolean[][] boolBoard;
    private int[][] board;

    public Board() {
        board = new int[8][8];
        boolBoard = new boolean[8][8];
        for (int row = 0; row < boolBoard.length; row++) {
            for (int col = 0; col < boolBoard[0].length; col++) {
                if ((row + col)%2 == 0)
                    boolBoard[row][col] = true;
                else
                    boolBoard[row][col] = false;
            }
        }
    }

    /*
    *//**
     * <p>  it fills the board with integer values that correspond to the correct piece and sets
     *      up the board in starting position
     *          <ul> WHITE
     *              <li><strong>king</strong>   >> 6</li>
     *              <li><strong>queen</strong>  >> 5</li>
     *              <li><strong>rook</strong>   >> 4</li>
     *              <li><strong>bishop</strong> >> 3</li>
     *              <li><strong>knight</strong> >> 2</li>
     *              <li><strong>pawn</strong>   >> 1</li>
     *          </ul>
     *          <ul> BLACK
     *              <li><strong>king</strong>   >> 16</li>
     *              <li><strong>queen</strong>  >> 15</li>
     *              <li><strong>rook</strong>   >> 14</li>
     *              <li><strong>bishop</strong> >> 13</li>
     *              <li><strong>knight</strong> >> 12</li>
     *              <li><strong>pawn</strong>   >> 11</li>
     *          </ul>
     * </p>
    public void fillBoard() {

    }*//*

    public boolean[][] getBoolBoard() {
        return boolBoard;
    }*/

    public int[][] getBoard() {
        return board;
    }
}