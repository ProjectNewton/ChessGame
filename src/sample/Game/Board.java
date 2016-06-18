package sample.Game;


import sample.Pieces.*;

/**
 * Created by Rohan D'Souza on 5/13/2016.
 */
public class Board {
    public static final int SIZE = 8;
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
    private Piece[][] pieceBoard;
    //private int[][] pieceBoard;

    public Board() {
        //pieceBoard = new int[SIZE][SIZE];
        pieceBoard = new Piece[SIZE][SIZE];
        setPieceBoard();
        boolBoard = new boolean[SIZE][SIZE];
        for (int row = 0; row < boolBoard.length; row++) {
            for (int col = 0; col < boolBoard[0].length; col++) {
                boolBoard[row][col] = (row + col) % 2 == 0;
            }
        }
    }
     /*   ** I G N O R E      T H I S **
     * <p>  it fills the pieceBoard with integer values that correspond to the correct piece and sets
     *      up the pieceBoard in starting position
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
     */
    public void setPieceBoard() {setTopBoard(); setBotBoard();}

    public void setTopBoard() {
        pieceBoard[0][0]= new Rook(0,0); pieceBoard[0][1]= new Knight(0,1); pieceBoard[0][2]= new Bishop(0,2); pieceBoard[0][3]= new King(0,3);
            pieceBoard[0][4]= new Queen(0,4); pieceBoard[0][5]= new Bishop(0,5); pieceBoard[0][6]= new Knight(0,6); pieceBoard[0][7]= new Rook(0,7);
        for (int i = 0; i < SIZE; i++) {
            pieceBoard[1][i]= new Pawn(1,i);
        }
    }

    public void setBotBoard() {
        pieceBoard[7][0]= new Rook(7,0); pieceBoard[7][1]= new Knight(7,1); pieceBoard[7][2]= new Bishop(7,2); pieceBoard[7][3]= new King(7,3);
            pieceBoard[7][4]= new Queen(7,4); pieceBoard[7][5]= new Bishop(7,5); pieceBoard[7][6]= new Knight(7,6); pieceBoard[7][7]= new Rook(7,7);
        for (int i = 0; i < SIZE; i++) {
            pieceBoard[7][i]= new Pawn(7,i);
        }
    }

    public boolean[][] getBoolBoard() {
        return boolBoard.clone();
    }

    public Piece[][] getPieceBoard() {
        return pieceBoard.clone();
    }
    public static void display(Piece[][]board)
    {
        System.out.println();
        for (int r = 0; r < board.length; r++)
        {
            for (int c = 0; c < board[0].length; c++)
            {
                if (c == 0)
                {
                    System.out.print(r);
                    System.out.print("  ");
                }
                else System.out.print(" ");
                if (board[r][c]==null) System.out.print(" ");
                else System.out.print(board[r][c]);
                if (c < board[0].length - 1) System.out.print(" |");
                else System.out.println();
            }
            if (r < board.length - 1) System.out.println("  -------------------------------");
        }
        System.out.println("\n   0   1   2   3   4   5   6   7\n");
    }
}