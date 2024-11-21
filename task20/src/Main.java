import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player_1 = new Player('X');
        Player player_2 = new Player('O');
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Ход 'X': ");
            player_1.makeMove(game, scanner);
            game.printPlayingField();
            game.gamelogic();
            if(game.checkWin(player_1.getSymbol()) || game.isFull()){
                break;
            }

            System.out.println("Ход 'O': ");
            player_2.makeMove(game, scanner );
            game.printPlayingField();
            game.gamelogic();
            if(game.checkWin(player_2.getSymbol())|| game.isFull()){
                break;
            }
        }

    }
}
