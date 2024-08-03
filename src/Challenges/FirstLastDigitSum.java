package Challenges;

public class FirstLastDigitSum {
    public static void main(String[] args) {
       System.out.println(sumFirstAndLastDigit(544));
    }

        // write code here
        public static int sumFirstAndLastDigit(int number){
            if(number <0){
                return -1;
            }
            int sum = number + number;
            int LastDigit = number % 10;
            while(number > 9){

                number = number /10;
                sum = LastDigit + number;
            }
            return sum;
        }

}
