package ArrayChallenge;
import java.util.Scanner;
public class MinimunValue {
    public static void main(String[] args) {
      int length = readInteger();
      int [] enter = readElements(length);
      int value = findMin(enter);

      System.out.println("the Min Value is: "+ value);
    }
    private static int readInteger(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Integer Number Pls: ");
        int num = s.nextInt();
        return num;
    }

    private static int[] readElements(int num){
        Scanner s = new Scanner(System.in);
        int[] in = new int[num];
        for(int i =0 ; i< num ; i++){
            System.out.println("Enter The "+ i  +"st Element!");
            in[i]= s.nextInt();

        }
        return in;
    }
    private static int findMin(int[] num){
        int temp = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i] <  temp){
                temp = num[i];
            }
        }
        return temp;
    }
}
