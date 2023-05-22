/*program to simulate a tic-tac-toe game between two players.*/

import java.util.*;

public class TicTacToeGame {
    private char board[][];
    private char currentPlayer;
    private boolean gameEnded;

    public TicTacToeGame(){
        board=new char[3][3];
        currentPlayer='X';
        gameEnded=false;
        initializeBoard();
    }
   public void playGame(){
        System.out.println("Welcome to Tic-Tac-Toe");
        printBoard();

        while (!gameEnded) {
            System.out.println("Player"+currentPlayer+"'s turn");
            makeMove(currentPlayer);
            printBoard();
            checkGameStatus();
            switchPlayer();
        }
    }
    private void initializeBoard(){
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
    }
   private void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private void makeMove(char player) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        do {
            System.out.print("Player " + player + ", enter the row (0-2): ");
            row = scanner.nextInt();
            System.out.print("Player " + player + ", enter the column (0-2): ");
            col = scanner.nextInt();
        } while (!isValidMove(row, col));

        board[row][col] = player;
    }
   private boolean isValidMove(int row, int col){
        if (row < 0 || row > 2 || col < 0 || col > 2){
            System.out.println("Invalid move. Please enter valid row and column.");
            return false;
        }
       if (board[row][col] != '-'){
            System.out.println("Invalid move. That position is already occupied.");
            return false;
        }
      return true;
    }
    private void checkGameStatus(){
        if (checkWin()){
            System.out.println("Player " + currentPlayer + " wins!");
            gameEnded = true;
        } else if (isBoardFull()){
            System.out.println("It's a draw! The board is full.");
            gameEnded = true;
        }
    }

    private boolean checkWin(){
        // Check rows
        for(int i=0;i<3;i++){
            if(board[i][0]==currentPlayer&&board[i][1]==currentPlayer&&board[i][2]==currentPlayer){
                return true;
            }
        }
       // Check columns
        for(int j=0;j<3;j++) {
            if(board[0][j]==currentPlayer&&board[1][j]==currentPlayer&&board[2][j]==currentPlayer){
                return true;
            }
        }
       // Check diagonals
        if((board[0][0]==currentPlayer&&board[1][1]==currentPlayer&&board[2][2]==currentPlayer)||(board[0][2]==currentPlayer&&board[1][1]==currentPlayer&&board[2][0]==currentPlayer)){
            return true;
        }
      return false;
      }
    private boolean isBoardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
    private void switchPlayer(){
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.playGame();
    }
}