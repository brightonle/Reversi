public class BasicReversi implements ReversiModel{
  private HexCell[][] board;  // The hexagonal board represented as a 2D array.
  private State currentPlayer;  // Track which player's turn it is.
  private boolean isGameOver = false;  // To know if the game has ended or not.
  private int size;
  private boolean gameStarted;

  public BasicReversi() {
    currentPlayer = State.BLACK;  // Assuming BLACK starts the game.
  }

  public void startGame(int size) {
    initializeBoard(size);
    setSurroundingCells();
    currentPlayer = State.BLACK;  // Assuming BLACK starts the game.
    isGameOver = false;
    gameStarted = true;  // Set the game as started.
  }

  private void initializeBoard(int size) {
    this.size = size;
    int totalRows = 2 * size - 1;
    board = new HexCell[totalRows][];

    for (int r = 0; r < totalRows; r++) {
      if (r < size) {
        board[r] = new HexCell[size + r];
      } else {
        board[r] = new HexCell[totalRows - r + size - 1];
      }

      // Initialize all cells to EMPTY
      for (int c = 0; c < board[r].length; c++) {
        board[r][c] = new HexCell();
      }
    }
    for (int r = 0; r < size-1; r++) {
      int padding = size - r - 1;
      HexCell[] newRow = new HexCell[board[r].length + padding];
      for (int c = 0; c < newRow.length; c++) {
        if (c < padding) {
          newRow[c] = null;
        } else {
          newRow[c] = board[r][c-padding];
        }
      }
      board[r] = newRow;
    }
  }

  private void setSurroundingCells() {
    // Assuming size is already initialized and is greater than 1
    if (size <= 1) {
      // Cannot surround the center cell on a board of size 1 or less
      return;
    }
    board[size-2][size-1].setState(State.BLACK);
    board[size-2][size].setState(State.WHITE);
    board[size-1][size-2].setState(State.WHITE);
    board[size-1][size].setState(State.BLACK);
    board[size][size-2].setState(State.BLACK);
    board[size][size-1].setState(State.WHITE);
  }

  /**
   * Returns the size of the board.
   *
   * @return the size of the board
   */
  public int getSize() {
    return size;
  }

  /**
   * Returns the current state of the board.
   *
   * @return the board state as a 2D array of HexCell objects
   */
  public HexCell[][] getBoard() {
    return board;
  }
}




