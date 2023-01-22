public class Mabor {
    void speech(String input){
        input = input + "\n";
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void halt(String input){
        input = input + "                         \n";
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void titles(String input){
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
