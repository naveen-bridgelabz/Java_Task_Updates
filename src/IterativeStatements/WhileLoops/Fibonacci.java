package IterativeStatements.WhileLoops;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 30;

        int first = 0;
        int second = 1;

        int i = 0;

        while (i<n){
            System.out.print(first + " ");
            int next = first + second;

            first = second;
            second = next;

            i++;
        }

    }
}
