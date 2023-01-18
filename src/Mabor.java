public class Mabor {
    void speech(String input){
        input = input + " " + " " + " ";
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void titleCard(String input){
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
