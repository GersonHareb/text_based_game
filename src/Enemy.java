import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemy {
    //String[] enemies = {"alien gris", "sombra gigante", "perro rabioso", "hombre de negro"};
    String nombreEnemigo;
    int vida;
    int vidamin;
    int ataque;
    int ataquemin;
     void enemyGenerator(){
        Random rand = new Random();
        Enemy alien = new Enemy();
        alien.nombreEnemigo = "Alien gris";
        alien.ataquemin = 10;
        alien.vidamin = 30;
        alien.vida = rand.nextInt(alien.vidamin*2);
        alien.ataque = rand.nextInt(alien.ataquemin * 3);

        Enemy shadow = new Enemy();
        shadow.nombreEnemigo = "Sombra maligna";
        shadow.ataquemin = 15;
        shadow.vidamin = 40;
        shadow.vida = rand.nextInt(shadow.vidamin*2);
        shadow.ataque = rand.nextInt(shadow.ataquemin * 3);

        Enemy dog = new Enemy();
        dog.nombreEnemigo = "Perro rabioso";
        dog.ataquemin = 7;
        dog.vidamin = 20;
        dog.vida = rand.nextInt(dog.vidamin*2);
        dog.ataque = rand.nextInt(dog.ataquemin * 3);

        Enemy serpent = new Enemy();
        serpent.nombreEnemigo = "Serpiente venenosa";
        serpent.ataquemin = 22;
        serpent.vidamin = 13;
        serpent.vida = rand.nextInt(serpent.vidamin*2);
        serpent.ataque = rand.nextInt(serpent.ataquemin * 3);

        List<Enemy> enemyList = new ArrayList<>();
        enemyList.add(alien);
        for (int i = 0; i < enemyList.size(); i++ ){
            System.out.println(enemyList.get(i));
        }
    }
}

class EnemyTest{
    public static void main(String[]args){
        Enemy e = new Enemy();

        //GameCombat bat = new GameCombat();
        e.enemyGenerator();
        //bat.gameAction(alien.nombreEnemigo, alien.vida, alien.ataque, "Gerson", 100 );

    }
}
