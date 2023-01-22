import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GameCombat {
    void startCombat(){
        Enemy enemy = new Enemy();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Mabor mabor = new Mabor();
        String text;
        if (Objects.equals(enemy.spawn(), "Alien Gris")){
            enemy.nombre = "Alien Gris";
            enemy.vida = 30;
            enemy.ataque = 20;
        }
        if (Objects.equals(enemy.spawn(), "Espectro Gigante")){
            enemy.nombre = "Espectro Gigante";
            enemy.vida = 50;
            enemy.ataque = 30;
        }
        if (Objects.equals(enemy.spawn(), "Perro Rabioso")){
            enemy.nombre = "Perro Rabioso";
            enemy.vida = 20;
            enemy.ataque = 15;
        }
        if (Objects.equals(enemy.spawn(), "Hombre de Negro")){
            enemy.nombre = "Hombre de Negro";
            enemy.vida = 40;
            enemy.ataque = 25;
        }
        System.out.println("Aparece " + enemy.spawn() + " con \n" + enemy.vida + " puntos de vida \n" + enemy.ataque + " puntos de ataque");
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
               int damageDealt = rand.nextInt(50);
               int damageTaken = rand.nextInt(enemy.ataque);

               enemy.vida -= damageDealt;


               text = "atacas causando " + damageDealt +" puntos de daño!!\n";
               mabor.speech(text);
               text = "recibes " + damageTaken + " ";
               mabor.speech(text);
           }
           if(enemy.vida < 1){

           }

        }
        System.out.println("\n*----------------------------------------------------------*");
        text = enemy.nombre + " ah sido derrotado!!";
        mabor.speech(text);

    }

}

class GameCombatTest{
    public static void main(String[]args){
        GameCombat g = new GameCombat();
        g.startCombat();
    }
}
