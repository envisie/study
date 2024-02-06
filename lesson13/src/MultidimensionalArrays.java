public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[] one_dimesion = new int[5];
        int[][] two_dimension1 = new int[5][5];
        int[][] two_dimension2 = {{1,2,3},
                                  {4,5,6},
                                  {7,8,9}};
        System.out.println(one_dimesion[0]);
        System.out.println(two_dimension1[0][0]);
        System.out.println(two_dimension2[0][0]);

        for (int i = 0; i < two_dimension2.length; i++) {
            for (int j = 0; j < two_dimension2[i].length; j++) {
                System.out.print(two_dimension2[i][j]);
            }
            System.out.println();
        }
    }
}