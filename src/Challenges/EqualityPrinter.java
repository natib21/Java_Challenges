package Challenges;

public class EqualityPrinter {
    public static void main(String[] args) {
       printEqual(1,2,1);
    }
    public static void printEqual(int num1,int num2, int num3){
        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println((num1 == num2)? ((num1 == num3)? "All numbers are equal":"Neither all are equal or different"):((num2 != num3)? ((num1 !=num3)? "All numbers are different":"Neither all are equal or different"):"Neither all are equal or different"));
    }
}
/*Equality Printer
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".



EXAMPLES OF INPUT/OUTPUT:

printEqual(1, 1, 1); should print text All numbers are equal

printEqual(1, 1, 2); should print text Neither all are equal or different

printEqual(-1, -1, -1); should print text Invalid Value

printEqual(1, 2, 3); should print text All numbers are different



TIP: Be extremely careful about spaces in the printed message.



NOTES

The solution will not be accepted if there are extra spaces.

The method printEqual needs to be defined as public static ​like we have been doing so far in the course.

Do not add main method to solution code.*/