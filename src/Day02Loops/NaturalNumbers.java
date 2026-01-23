package Day02Loops;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0;

        for (int i = 1; i <= n; i++) {
            num = num + i;
        }

        System.out.println("Sum = " + num);
    }
}
