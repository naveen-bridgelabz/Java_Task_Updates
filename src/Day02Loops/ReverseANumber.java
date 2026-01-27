package Day02Loops;

import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println("Enter Number : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reverse = 0;

        for (; n != 0; n = n / 10) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reverse = " + reverse);

    }
}