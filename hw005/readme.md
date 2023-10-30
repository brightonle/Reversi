Reversi Game Model
Overview:
The Reversi Game Model is designed to simulate the game board, manage the state of the game, and handle player moves in a Reversi game. It includes the board structure, piece management, and core game logic.

Quick Start:
To use the Reversi Game Model, follow these steps:

Create an instance of the ReversiBoard.
Initialize the board with a desired size using the initializeBoard(size) method.
Use the provided methods to make moves, check for valid moves, and manage the game state.

ReversiBoard board = new ReversiBoard();
board.initializeBoard(8); // Initialize an 8x8 board
// Perform game operations...

Components:
ReversiBoard:
Manages the game board state, valid moves, and game logic.
Initializes the board and allows players to make moves, checks for valid moves, and checks the game's end conditions.

ReversiPiece:
Represents individual pieces on the board.
Holds the state of each piece (empty, black, or white).

Operations:
ReversiBoard:
initializeBoard(int size)
getPieceAt(int row, int col)
makeMove(int row, int col, Player player)
getValidMoves(Player player)
isGameOver()
calculateScores()
resetBoard()
ReversiPiece:
getState()
Class Invariant:
The ReversiBoard maintains the consistent state of the board after each operation, accurately representing the positions of pieces.




