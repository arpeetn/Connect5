package cpsc2150.extendedConnectX.models;
/**
 * @author Arpeet Naik
 * @version 1.0
 */
public abstract class AbsGameBoard implements IGameBoard {

    /**
     *This method creates a string to show row and column position
     *
     * @return one string that shows the entire game board
     *
     * @pre none
     * @post string that shows the entire game board = {"
    |0|1|2|3|4|5|6|7|8|
    | | | | | | | | | |
    | | | | | | | | | |
    | | | | | | | | | |
    | | | | | | | | | |
    | | | | | | | | | |
    | | | | | | | | | |
    "}
     * [all of the empty spaces in the game board above will be filled with either an empty space, X, or O
     *
     * if gameboard[i][j] == ' ', the empty space will stay empty
     * if gameboard[i][j] == 'X', the empty space will have an X inside
     * if gameboard[i][j] == 'O', the empty space will have a O inside]
     *
     */

    @Override
    public String toString() {
        String board = "|";
        for (int i = 0; i < getNumColumns(); i++) board += i + "|";

        board += "\n|";

        for (int i = getNumRows()-1; i >= 0; i--) {
            for(int j = 0; j < getNumColumns(); j++) {
                BoardPosition pos = new BoardPosition(i,j);
                board += whatsAtPos(pos) + "|";
            }
            if (i - 1 != -1) board += "\n|";
        }
        board+="\n";
        return board;
    }
}
