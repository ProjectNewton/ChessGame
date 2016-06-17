package sample.Game;

/**
 * Created by Rohan D'Souza on 5/17/2016.
 */
public class Coordinate{
    private int row;
    private int col;


    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public static int getIndex(Coordinate[] array, Coordinate coordinate) {
        int index = -1;
        for (Coordinate coor : array) {
            index++;
            if (coor.equals(coordinate))
                return index;
        }
        return index;
    }



    public boolean equals(Coordinate o) {
        return getCol() == o.getCol() && getRow() == o.getRow();
    }
}
