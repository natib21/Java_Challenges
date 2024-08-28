package Challenges;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
    public  static  String isPalindrome(int number){
            int reverse = 0;
            int lastDigit = 0;
            int existing = number;
            while (number > 9){
                lastDigit = number % 10;
                number = number/10;
            }

            return "Value is Last digit = "+lastDigit + " and = "+number;

    }
}
