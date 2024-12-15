# TIC-TOC-TOE-GAME
Tic-Tac-Toe

This is a simple implementation of the classic Tic-Tac-Toe game in Java.

How to Play

Run the Main class.
The game will display an empty 3x3 board.
Players take turns entering the row and column (0-2) where they want to place their mark ('X' or 'O').
The game checks for a valid move (within board boundaries and empty cell).
If the move is valid, the player's mark is placed on the board.
The game checks if the current player has won.
If a player wins, the game announces the winner and ends.
If the board is full and no player has won, the game ends in a draw.
Game Rules

Players alternate turns placing their marks ('X' or 'O') on the board.
The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins.
If the board is full and no player has won, the game ends in a draw.   
Code Structure

Main class: Contains the main game logic, including player input, move validation, and game state updates.
initializeBoard method: Initializes the game board with empty spaces.
isValidMove method: Checks if a given move is valid (within board boundaries and empty cell).
hasWon method: Checks if a player has won by checking for three of their marks in a row.
printBoard method: Prints the current state of the game board to the console.
Key Features:

Player vs. Player: Allows two players to play against each other.
Basic Game Logic: Includes move validation, win condition checks, and a draw condition.
Clean Code: Follows basic coding principles for readability and maintainability.
To Run

Make sure you have Java installed on your system.
Compile the Java source code using a Java compiler (e.g., javac Main.java).
Run the compiled code using java Main.
Contributing

Contributions are welcome! If you find any bugs or have any suggestions for improvement, please feel free to submit a pull request.
