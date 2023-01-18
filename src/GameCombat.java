import java.util.Random;
import java.util.Scanner;

public class GameCombat {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int daño = rand.nextInt(30);
    void gameAction(String enemy, int vidaEnemigo, int ataqueEnemigo, String playerName, int vidaJugador){
        System.out.println("un terrible " + enemy + " aparece en tu camino");
        System.out.println("Que deseas hacer:");
        System.out.println("Opcion 1: atacar");
        int myLife = vidaJugador;
        int enemyLife = vidaEnemigo;
        while(enemyLife > 0){
            String input = in.nextLine();
            if(input.equals(1)){
                daño -= enemyLife;
                ataqueEnemigo -= myLife;
                System.out.println("golpeas al " + enemy + " provocando " + daño + " puntos de daño");
                System.out.println("el " + enemy + " te golpea quitandote " + ataqueEnemigo + " puntos de vida");
                if(vidaJugador <1){
                    System.out.println(" te undes en un charco de tu propia sangre " + enemy + " te mira con curiosidad mientras tomas tu ultimo aliento...");
                    break;
                }
            }

        }
    }
}
