public interface ReversiModel {
  /**
   * Returns the size of the board.
   *
   * @return the size of the board
   */
  int getSize();

  /**
   * Returns the current state of the board.
   *
   * @return the board state as a 2D array of HexCell objects
   */
  HexCell[][] getBoard();
}
