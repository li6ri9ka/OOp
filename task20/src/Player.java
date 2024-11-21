import java.util.Scanner;

public class Player {
    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public void makeMove(Game game, Scanner input) {
        while (true){
            System.out.println("Введите координаты через пробел");
            int x = input.nextInt();
            int y = input.nextInt();
            if (x >= 0 && x < 3 && y >= 0 && y < 3 && game.getPlayingField()[x][y] == ' ') {
                game.getPlayingField()[x][y] = symbol;
                break;
            } else if (game.isFull()) {
                break;
            } else {
                System.out.println("Неверные координаты или же клетка занята");
            }
        }
    }


}
