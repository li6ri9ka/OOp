import java.util.Scanner;

public class Game {
    private final char [][]playingField = new char[3][3];
    private final char sing_X= 'X';
    private final char sing_O= 'O';
    private final char EMPTY = ' ';

    public Game() {
        initialize();
    }

    public char[][] getPlayingField() {
        return playingField;
    }

    private void initialize(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                playingField[row][col] = EMPTY;
            }
        }
    }

    public void printPlayingField() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char symbol;
                if(playingField[row][col] == sing_X) {
                    symbol = sing_X;
                }
                else if(playingField[row][col] == sing_O) {
                    symbol = sing_O;
                }
                else {
                    symbol = EMPTY;
                }
                System.out.print(symbol);
                if(col < 2 ){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("__________");
            }
        }

    }
    public boolean isFull(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (playingField[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


        public void gamelogic(){
            if(checkWin('X')){
                System.out.println(sing_X + " - Выйграл");
            }else if(checkWin('O')){
                System.out.println(sing_O + " - Выйграл");
            } else if (isFull()) {
                System.out.println("Ничья");

            }

        }

        public boolean checkWin(char symbol){
            for (int row = 0; row < 3; row++) {
                if (playingField[row][0] == symbol && playingField[row][1] == symbol && playingField[row][2] == symbol) {
                    return true;
                }
            }
            for (int col = 0; col < 3; col++) {
                if (playingField[0][col] == symbol && playingField[1][col] == symbol && playingField[2][col] == symbol) {
                    return true;
                }
            }

            if (playingField[0][0] == symbol && playingField[1][1] == symbol && playingField[2][2] == symbol) {
                return true;
            }

            if (playingField[0][2] == symbol && playingField[1][1] == symbol && playingField[2][0] == symbol) {
                return true;
            }
            return false;
    }
}
