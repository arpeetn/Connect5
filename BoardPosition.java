package cpsc2150.extendedConnectX.models;
/**
 *
 * @author Arpeet Naik
 * @version 1.0
 *
 * @invariant LOWEST_ROW >= maxRow <= ROW AND LOWEST_COLUMN >= maxColumn <= COLUMN
 */
public class BoardPosition {
    private int r;
    private int c;

    /**
     * @description creates a new BoardPosition with the specified row and column numbers
     *
     * @param column column
     * @param row row
     *
     * @pre
     * row = r AND column = c
     *
     * @post gets the number of columns and rows for Board
     */

    public BoardPosition(int row, int column) {
        r = row;
        c = column;
    }

    /**
     * @description return the row for the board
     *
     * @return number of rows
     *
     * @pre none
     *
     * @post gets number of rows
     *  row = #row
     */
    public int getRow() {

        return r;
    }

    /**
     * @description return the row for the board
     *
     * @return number of columns
     *
     * @pre none
     *
     * @post gets number of columns
     * column = #column
     */

    public int getColumn() {

        return c;
    }

    /**
     * This method compares two string in BoardPosition to see if the position is equal
     *
     * <b>NOTE:</b> Connect 5 has a max of COLUMN columns
     *
     * @return true or false depending on iff two strings are equal
     *
     * @pre none
     *
     * @post
     * true iff [two string are equal] OR
     * false iff [two strings are not equal] AND
     * BoardPosition = #BoardPosition
     */
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass())
        {
            return false;
        }
        BoardPosition temp = (BoardPosition)obj;
        return (temp.getRow() == getRow() && temp.getColumn() == getColumn());
    }
    public String toString() {

        String sep = "";

        return sep;
    }
}
