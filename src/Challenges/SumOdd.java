package Challenges;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,10));
    }
    public static boolean isOdd(int number){
        if((number < 0) || (number % 2 == 0)){
            return false;
        }else{
            return true;
        }


    }
    public static int sumOdd(int start,int end){
        int sum = 0;
        if(start < 0 || end < 0 || end < start){
            return -1;
        }
        for(int view = start ; view <= end ; view++){
            if(isOdd(view)){
                sum += view;
            }
        }
        return sum;
    }
}
