import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GameMode newGame = new GameMode();
        GameCombat battle = new GameCombat();
        Mabor mabor = new Mabor();
        Random rand = new Random();
        Hero player = new Hero();
        String period = " ";
        int diceRoll = rand.nextInt(6);
        String input;

        boolean on = true;
        GAME:
        while(on){
            newGame.intro();
            input = "Existo... " + "   "+ "usuario, ingresa tu nombre.\n";
            mabor.speech(input);
            player.heroName = in.nextLine();
            System.out.println(" ");
            input = "tira los dados";
            mabor.speech(input);
            System.out.println("Que quieres hacer?");
            System.out.println("1) tirar dados");
            int lifeChoice;
            lifeChoice = in.nextInt();
            if(lifeChoice == 1){
                player.heroLife = diceRoll + 1;
                input = "Tu vida sera de " + player.heroLife + " puntos";
                mabor.speech(input);
                if(player.heroLife < 3){
                    input = "La suerte debe odiarte...";
                    mabor.speech(input);
                }
            }
            System.out.println(" ");
            input = "tira los dados nuevamente... si te atreves";
            mabor.speech(input);
            System.out.println("Que quieres hacer?");
            System.out.println("1) tirar dados");
            int attackChoice;
            attackChoice = in.nextInt();
            if(attackChoice == 1){
                diceRoll = rand.nextInt(6);
                player.heroAttack = diceRoll + 1;
                input = "Tu poder de ataque sera de " + player.heroAttack + " puntos";
                mabor.speech(input);
                if(player.heroAttack < 3){
                    input = "la muerte se cierne sobre ti...";
                    mabor.speech(input);
                }
            }
            input = "Bienvenido a mi laberinto " + player.heroName;
            mabor.speech(input);
            input = "Ordena sabiamente tus estrategias, estarás luchando por tu vida...";
            mabor.speech(input);
            input = "Espero nos veamos pronto.";
            mabor.speech(input + "          ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Decides ingresar al laberinto");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            mabor.halt(period);
            System.out.println("Una criatura salta desde las sombras!!");
            mabor.halt(period);
            battle.startCombat();
            on = false;
        }
    }
}