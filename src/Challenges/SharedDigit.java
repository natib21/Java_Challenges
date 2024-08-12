package Challenges;

public class SharedDigit {
    public static void main(String[] args) {
     System.out.println(hasSharedDigit(-90,10));
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1 >= -99 && num1 <= 10) && (num1 >= -99 && num1 <= 10)){

           if(num1 == num2){
               return true;
           }


        }
        return false;
    }
}
