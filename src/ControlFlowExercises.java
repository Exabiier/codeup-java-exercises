import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while(i<=15){
//            System.out.println(i);
//            i++;
//        }

//        int x = 100;
//        do {
//            System.out.println(x);
//            x = x - 5;
//        } while (x >= -10);
//
//        double y = 2;
//        do {
//            System.out.println(y);
//            y = Math.pow(y, 2);
//        } while (y <= 100000);

//        for(int i = 100; i>=-10; i = i-5){
//            System.out.println(i);
//        }
//        double x=2;
//        for (int i = 1; i < 6; i++) {
//            System.out.println(x);
//            x = Math.pow(x, 2);
//        }

//        for (int i = 1; i <= 100; i++ ) {
//            if(i%3==0){
//                System.out.println("Fizz");
//            } else{
//            System.out.println(i);}
//        }


//            int u = 100;
//
//            if(100>=u && u>=88){
//                System.out.println("A");
//
//            } else if(87>=u && u>=80){
//            System.out.println("B");
//            } else if(79>=u && u>=67){
//            System.out.println("C");
//            } else if(66>=u && u>=60){
//            System.out.println("D");
//            } else {
//            System.out.println("F");
//            }

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userInput = sc.next();

        boolean confirmation = userInput.equals("y");

        System.out.println("What system would you like to go up to: ");
        String userInput2 = sc.next();
        if(confirmation){
            final int IMAX = Integer.parseInt(userInput2);
            final double XMAX = 10;
            System.out.println("Here is your table!");

            for (int n=1; n<=IMAX; n++){
                System.out.printf("%10d", n);
            }
            System.out.println();

            for (int n=1; n<=IMAX; n++){
                System.out.printf("%10s", "x");
            }
            System.out.println();

            for (double i=1; i<=XMAX; i++) {
                for (int x = 1; x <=IMAX; x++) {
                    System.out.printf("%10.0f", Math.pow(i, x));
                } System.out.println();
            }

        }



    }

}




