public class Main {
    public static void main(String[] args) {
        System.out.println(resolve(new int[]{1, 2, 3, 4}, 4)); // output: -1
        System.out.println(resolve(new int[]{1, 0, 3, 0}, 4)); // output: 2
        System.out.println(resolve(new int[]{1, 2, 0, 4}, 4)); // output: 3
        System.out.println(resolve(new int[]{1, 2, 3, 0}, 4)); // output: -1
    }

    public static int resolve(int[] array, int arraySize){
        for(int i=0;i<arraySize-1;i++){
            if(array[i]==0){
                try{
                    if(array[i+2]==0){
                        return i+1;
                    }
                } catch(Exception e){
                    return i+1;
                }
            }
        }
        return -1;
    }
}