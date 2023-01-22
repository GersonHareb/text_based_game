import java.util.Random;
import java.util.Scanner;

public class GameMode {
    Mabor mabor = new Mabor();
    String input;
    String period = " ";
void intro(){
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Te encuentras en casa de tus padres ordenando tus antiguas pertenencias, \nuna gastada caja de madera color burdeo llama tu atencion...\n");
    mabor.halt(period);
    System.out.println("Dentro, te encuentras con una antigua computadora llena de stickers escritos en un idioma desconocido");
    System.out.println("La curiosidad toma lo mejor de ti y decides encenderla");
    mabor.halt(period);
    mabor.halt(period);
    System.out.println("La vieja maquina comienza a realizar delicados ruidos mecanicos y comienza a funcionar\nSu ventilador y disco duro");
    mabor.halt(period + "\n");
    mabor.halt(period);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("как вверху, так внизу...\n");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    input = ".........\n";
    mabor.speech(input);
    System.out.println("*------------------------------------------------------------------------------------------*");
    mabor.titles("\n" +
            "████████╗██╗░░██╗███████╗  ██╗░░██╗░█████╗░██╗░░░██╗███╗░░██╗████████╗██╗███╗░░██╗░██████╗░\n" +
            "╚══██╔══╝██║░░██║██╔════╝  ██║░░██║██╔══██╗██║░░░██║████╗░██║╚══██╔══╝██║████╗░██║██╔════╝░\n" +
            "░░░██║░░░███████║█████╗░░  ███████║███████║██║░░░██║██╔██╗██║░░░██║░░░██║██╔██╗██║██║░░██╗░\n" +
            "░░░██║░░░██╔══██║██╔══╝░░  ██╔══██║██╔══██║██║░░░██║██║╚████║░░░██║░░░██║██║╚████║██║░░╚██╗\n" +
            "░░░██║░░░██║░░██║███████╗  ██║░░██║██║░░██║╚██████╔╝██║░╚███║░░░██║░░░██║██║░╚███║╚██████╔╝\n" +
            "░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░╚═╝░░╚══╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("*------------------------------------------------------------------------------------------*");
    mabor.halt(period);
}

}
