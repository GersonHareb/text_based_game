import java.util.Random;
import java.util.Scanner;

public class GameCombat {
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    Mabor mabor = new Mabor();
    String text;

    void startCombat(){
        Enemy enemy = new Enemy();
        int e = rand.nextInt(4);
        try{
            if (e == 0){
                enemy.nombre = "Alien Gris";
                enemy.vida = 30;
                enemy.ataque = 20;
            }
            if (e == 1){
                enemy.nombre = "Espectro Gigante";
                enemy.vida = 50;
                enemy.ataque = 30;
            }
            if (e == 2){
                enemy.nombre = "Perro Rabioso";
                enemy.vida = 20;
                enemy.ataque = 15;
            }
            if (e == 3){
                enemy.nombre = "Hombre de Negro";
                enemy.vida = 40;
                enemy.ataque = 25;
            }
            System.out.println("Aparece " + enemy.nombre + " con \n" + enemy.vida + " puntos de vida \n" + enemy.ataque + " puntos de ataque");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("*----------------------------------------------------------*");
            text = "██████╗░░█████╗░████████╗░█████╗░██╗░░░░░██╗░░░░░░█████╗░██╗\n" +
                    "██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║░░░░░██║░░░░░██╔══██╗██║\n" +
                    "██████╦╝███████║░░░██║░░░███████║██║░░░░░██║░░░░░███████║██║\n" +
                    "██╔══██╗██╔══██║░░░██║░░░██╔══██║██║░░░░░██║░░░░░██╔══██║╚═╝\n" +
                    "██████╦╝██║░░██║░░░██║░░░██║░░██║███████╗███████╗██║░░██║██╗\n" +
                    "╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚══════╝╚══════╝╚═╝░░╚═╝╚═╝";
            mabor.titles(text);
            System.out.println("\n*----------------------------------------------------------*");
            while (enemy.vida > 0) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(enemy.nombre);
                System.out.println("Puntos de vida: " + enemy.vida);
                text = "Que haras?\n";
                mabor.speech(text);
                System.out.println("1) Atacar");
                System.out.println("2) Huir");
                String input = in.nextLine();

                if(input.equals("1")){
                    int damageDealt = rand.nextInt(10);
                    enemy.vida -= damageDealt;
                    text = "atacas causando " + damageDealt +" puntos de daño!!\n";
                    mabor.speech(text);
                }
                if (enemy.vida < 1){
                    break;
                } else {
                    int damageTaken = rand.nextInt(enemy.ataque);
                    text = "recibes " + damageTaken + " ";
                    mabor.speech(text);
                }

                //if (player)
            }
            System.out.println("\n*----------------------------------------------------------*");
            text = enemy.nombre + " ah sido derrotado!!";
            mabor.speech(text);
        }catch(Throwable error){
            System.out.println(error);
            }
        }

    }



class GameCombatTest{
    public static void main(String[]args){
        GameCombat g = new GameCombat();
        g.startCombat();
    }
}
