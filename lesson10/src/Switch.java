import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свій вік: ");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Початок");
                break;
            case 20:
                System.out.println("Ось: " + 20);
            default:
                System.out.println("default, без break до і після, так задумано");
        }
    }
}