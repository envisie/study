public class Main {
    public static void main(String[] args) {
        System.out.println(resolveMe(new int[]{1, 2, 3, 4}, 4)); // output: -1
        System.out.println(resolveMe(new int[]{1, 0, 3, 0}, 4)); // output: 2
        System.out.println(resolveMe(new int[]{1, 2, 0, 4}, 4)); // output: 3
        System.out.println(resolveMe(new int[]{1, 2, 3, 0}, 4)); // output: -1
    }

    public static int resolveMe(int[] arrayNumbers, int arraySize){
        for(int i=0;i<arraySize-1;i++){
            if(arrayNumbers[i]==0){
                try{
                    if(arrayNumbers[i+2]==0){
                        return i+1;
                    } else if(i==1){
                        return i-1;
                    }
                } catch(Exception e){
                    return i+1;
                }
            }
        }
        return -1;
    }
}