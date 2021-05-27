package SaimsTasks;

public class TicTacToe {

        public static char[][] table ( char[][] board){
            int R = 3;
            int C = 3;

            System.out.println("---------------");
            for (int i=0 ; i < R; i++){
                System.out.print("|");
                for(int j =0; j< C;j++){
                    System.out.print(" " + board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("---------------");
            }
            return board;
        }
        public static void main(String[] args) {
        char player1 = 'X';
        char player2 = 'O';

        char[][] board = {

                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

            System.out.println(table(board));

    }

}
