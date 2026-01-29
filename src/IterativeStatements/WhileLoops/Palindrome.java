package IterativeStatements.WhileLoops;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1335331;
        int originalNum = num;
        int reverse = 0;

        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println(reverse);
        System.out.println(originalNum);

        if(originalNum == reverse){
            System.out.println("The Number is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
