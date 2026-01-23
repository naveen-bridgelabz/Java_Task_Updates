package Operators;

import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {

//        if (args.length < 2) {
//            System.out.println("Please pass month and day as command-line arguments");
//            return;
//        }

        Scanner sm = new Scanner(System.in);
        int m = sm.nextInt();
        Scanner sd = new Scanner(System.in);
        int d = sd.nextInt();

        boolean result =
                (m == 3 && d >= 20) ||
                        (m == 4 || m == 5) ||
                        (m == 6 && d <= 20);

        if (result == true) {
            System.out.println("spring season");
        }else {
            System.out.println("Not a Spring Season");
        }
//        int m = Integer.parseInt(args[0]);
//        int d = Integer.parseInt(args[1]);
//
//        boolean result =
//                (m == 3 && d >= 20) ||
//                        (m == 4 || m == 5) ||
//                        (m == 6 && d <= 20);
//
//        System.out.println(result);
    }
}
