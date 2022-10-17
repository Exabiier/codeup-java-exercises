package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    private String scanner;

    public String getScanner() {
        return scanner;
    }

    Input(){
        ;
    }
    Input(String userInput){
        this.scanner = userInput;
        System.out.println(userInput);
    }

    Input(int userInput){
        this.scanner = Integer.toString(userInput);
    }

    Input(double userInput){
        this.scanner = Double.toString(userInput);
    }

    static String getString(){
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Input y = new Input(userInput);
        y.scanner = userInput;
        return y.scanner;
    }

    static boolean yesNo(){
        System.out.println("Yes or no?:");
        Scanner sc1 = new Scanner(System.in);
        String ans = sc1.next();
        Input z = new Input(ans);
        z.scanner = ans;
        if(z.scanner.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }

    static int getInt(int min, int max){
        System.out.println("Pick a number 1 through 100:");
        Scanner sc2 = new Scanner(System.in);
        int userNumber = sc2.nextInt();
        new Input(userNumber);
        if(min<userNumber && userNumber<max){
            return userNumber;
        }else{
            return getInt(min,max);
        }

    }

    static int getInt(){
        System.out.println("Enter a Number:");
        Scanner sc3 = new Scanner(System.in);
        int userNumber2 = sc3.nextInt();
        new Input(userNumber2);
        return userNumber2;


    }

    static double getDouble(double min, double max){
        System.out.println("Pick a number 1 through 100:");
        Scanner sc2 = new Scanner(System.in);
        double userNumber = sc2.nextDouble();;
        new Input(userNumber);
        if(min<userNumber && userNumber<max){
            return userNumber;
        }else{
            return getDouble(min,max);
        }
    }

    static double getDouble(){
        System.out.println("Enter a Number:");
        Scanner sc3 = new Scanner(System.in);
        double userNumber2 = sc3.nextDouble();
        new Input(userNumber2);
        return userNumber2;
    }





    public static void main(String[] args) {
//        scanner and using a constructor to to make a property in the new object
//        System.out.println("Enter a string:");
//        Scanner sc = new Scanner(System.in);
//        String userInput = sc.nextLine();
//        Input x = new Input(userInput);
//        System.out.println(x.scanner);

//        String x = getString();
//        System.out.println(x);
//
//        boolean y = yesNo();
//        System.out.println(y);

//        int c = getInt(0,101);
//        System.out.println(c);

//        int v = getInt();
//        System.out.println(v);

//        double g = getDouble(0,101);
//        System.out.println(g);

//        double f = getDouble();
//        System.out.println(f);

        ;

//        System.out.println(f.getScanner());

    }


}

