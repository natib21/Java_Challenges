package Challenges;

public interface NumberInWord {
    public static void main(String[] args) {
    printNumberInWord(100);
    }
    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.print("ZERO");
                break;
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
            default:
                System.out.print("OTHER");
        }
    }
}
/*
Number In Word
Write a method called printNumberInWord.
The method has one parameter number which is the whole number.
 The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.
*/