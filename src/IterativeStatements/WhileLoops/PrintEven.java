package IterativeStatements.WhileLoops;

public class PrintEven {
    public static void main(String[] args) {

        int num = 0;

        while(num<=50){
//            System.out.println(num);
//            int even = 0;

            if(num%2 == 0 && num>0){
                System.out.println(num);
            }

            num++;
        }
    }
}
