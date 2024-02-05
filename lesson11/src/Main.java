public class Main {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers1 = new int[10];
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = 1;
        }
        int[] numbers2 = {1, 2, 3};

        System.out.println("number" + number);
        System.out.println("numbers1 adress: " + numbers1); // виведе адресу
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("numbers1["+i+"]:"+numbers1[i]);
        }
        System.out.println("numbers2 adress: " + numbers2); // виведе адресу
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2["+i+"]:"+numbers2[i]);
        }
    }
}