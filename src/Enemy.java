import java.util.Random;

public class Enemy {
    String[] enemies = {"Alien Gris", "Espectro Gigante", "Perro Rabioso", "Hombre de Negro"};
    String nombre;
    int vida;
    int vidamin;
    int ataque;
    int ataquemin;

    public String spawn(){
        Random rand =  new Random();
        int e = rand.nextInt(enemies.length);
        return enemies[e];
    }
}
