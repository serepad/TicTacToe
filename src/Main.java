/**
 * Create by Sergey Padzhev on 12.10.2016
 * TicTacToe console game on Java. Programming training.
*/



import java.util.*;

public class TicTacToe {

    final char PLAYER_DOT = 'X';
    final char AI_DOT = 'O';
    final char EMPTY_DOT = '.';
    final int FIELD_SIZE = 3;
    char [][] field = new char[FIELD_SIZE][FIELD_SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new TicTacToe().go();
    }

    void go(){
        initField();
        printField();
        while (true){
            turnPlayer();
            printField();
            if (checkWin(PLAYER_DOT)){
                System.out.println("You Won!!!");
                break;
            }
            if(isFieldFull()){
                System.out.println("Sorry draw...");
                break;
            }
            turnAI();
            printField();
            if(checkWin(AI_DOT)){
                System.out.println("AI Won!?!?!");
                break;
            }
            if(isFieldFull()){
                System.out.println("Sorry draw...");
            }
        }
    }

    void turnPlayer(){
        int x, y;
        do {
            
        }
    }
}
