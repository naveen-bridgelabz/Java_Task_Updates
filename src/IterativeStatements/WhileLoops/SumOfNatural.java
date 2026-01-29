package IterativeStatements.WhileLoops;

public class SumOfNatural {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        int i = 1;
        while(i<=n){
//            sum += i;
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
