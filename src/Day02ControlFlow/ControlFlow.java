package Day02ControlFlow;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        System.out.println("Hello all");

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 5; i++){
            System.out.println(num * i);
        }
    }
}
