package ArrayChallenge;
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
    public static int[] getIntegers(int length){
        Scanner s = new Scanner(System.in);
        int []num = new int[length] ;
        for(int i=0 ; i <num.length; i++){
            num[i] = s.nextInt();
        }
        return num;
    }
    public static void printArray(int[] arra){
        for(int i = 0; i< arra.length  ; i++){
            System.out.println("Element "+ i +" contents "+arra[i]);
        }
    }
    public static int[] sortIntegers(int[] arra){
        int[] sortedArray = Arrays.copyOf(arra, arra.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1] ){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }


            }
        }
        return sortedArray;
    }


}
