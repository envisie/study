
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        //String s = new String("takato");
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть що небудь: ");
        String string = s.nextLine();
        System.out.println("Ви ввели: "+ string);

        System.out.println("Введіть число: ");
        int x = s.nextInt();
        System.out.println("Ви ввели число: " + x);
    }
}