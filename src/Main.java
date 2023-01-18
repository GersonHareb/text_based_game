import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mabor mabor = new Mabor();
        String playerName;
        String playerStatus;
        String input;
        String titleCard;


        System.out.println("-----------------------------------------------------------------------------------------");
        input = "\n" +
                "████████╗██╗░░██╗███████╗  ██╗░░██╗░█████╗░██╗░░░██╗███╗░░██╗████████╗██╗███╗░░██╗░██████╗░\n" +
                "╚══██╔══╝██║░░██║██╔════╝  ██║░░██║██╔══██╗██║░░░██║████╗░██║╚══██╔══╝██║████╗░██║██╔════╝░\n" +
                "░░░██║░░░███████║█████╗░░  ███████║███████║██║░░░██║██╔██╗██║░░░██║░░░██║██╔██╗██║██║░░██╗░\n" +
                "░░░██║░░░██╔══██║██╔══╝░░  ██╔══██║██╔══██║██║░░░██║██║╚████║░░░██║░░░██║██║╚████║██║░░╚██╗\n" +
                "░░░██║░░░██║░░██║███████╗  ██║░░██║██║░░██║╚██████╔╝██║░╚███║░░░██║░░░██║██║░╚███║╚██████╔╝\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░╚═╝░░╚══╝░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░";
        mabor.titleCard(input);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Te encuentras en casa de tus padres, ordenando tu antigua habitacion");
        System.out.println("En el piso, un festival de coloridas revistas, juguetes y dibujos que te inundan de nostalgia y sentimientos encontrados");
        System.out.println("de pronto, una caja sellada fuertemente con cinta adhesiva llama tu atencion");
        System.out.println("Tiene solo una etiqueta pegada encima:");
        System.out.println("NO ABRIR - OTOÑO 2005");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        input = "Cual es tu nombre?";
        mabor.speech(input);
        System.out.println(" ");
        playerName = in.nextLine();
       /* if(playerName == null || playerName.length() < 1 || playerName == ""){
            input = "Enserio? no tienes nombre?";
        }else{
            input = "Un gusto en saludarle... " + playerName;
        }*/
        input = "Un gusto en saludarle... " + playerName;
        mabor.speech(input);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("un escalofrio te recorre desde la espalda hasta la nuca");
        System.out.println("Esto debe ser una broma, es solo una maquina vieja");


    }
}