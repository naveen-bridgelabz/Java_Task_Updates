package Operators;

import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double val = b * b - 4 * a * c;

        if (val > 0) {
            double root1 = (-b + Math.sqrt(val)) / (2 * a);
            double root2 = (-b - Math.sqrt(val)) / (2 * a);

            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if (val == 0) {
            double root = -b / (2 * a);
            System.out.println("Both roots are same = " + root);
        }
        else {
            System.out.println("No real roots (delta is negative)");
        }

        sc.close();
    }
}

