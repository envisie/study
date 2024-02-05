public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] row1 = new String[5];
        String[] row2 = new String[]{"Hello", "World"};
        String[] row3 = {"Hi", "There"};
        System.out.println(row3[0]);

        for(String word:row1){
            System.out.println("word in row1:" + word);
        }

        for (String word:row2){
            System.out.println("word in row2:" + word);
        }

        System.out.println("row3 address:" + row3);

        String pointToNull=null;
        System.out.println(pointToNull);
    }
}