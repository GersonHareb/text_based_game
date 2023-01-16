import java.util.Random;

public class Enemy {
}

class EnemyTest{
    public static void main(String[]args){
        String[] enemies = {"grey alien", "tall shadow", "dog", "man in Black"};
        Random rand = new Random();
        int e = rand.nextInt(enemies.length);

        System.out.println("A scary " + enemies[e] + " appears out of nowhere!!");
    }
}
