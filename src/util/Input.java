package util;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Input {
    public Scanner scanner;


//    public String getScanner() {
//        return scanner;
//    }

    public  Input(){
        this.scanner = new Scanner(System.in);

    }




//    public static void change(String input){
//        this.scanner = input;
//    }
//    Input(String userInput){
//        this.scanner = userInput;
//        System.out.println(userInput);
//    }
//
//    Input(int userInput){
//        this.scanner = Integer.toString(userInput);
//    }
//
//    Input(double userInput){
//        this.scanner = Double.toString(userInput);
//    }

    static String getString(){
        System.out.println("Enter a string:");
//        Scanner sc = new Scanner(System.in);
        Input x = new Input();
        return x.scanner.nextLine();
    }

    static boolean yesNo(){
        System.out.println("Yes or no?:");
        Input x = new Input();
        String z = x.scanner.nextLine();;
        if(z.equalsIgnoreCase("yes")){
            return true;
        } else{
            return false;
        }
    }

    static int getInt(int min, int max){
        System.out.println("Pick a number 1 through 100:");
        Input x = new Input();
        int userNumber= x.scanner.nextInt();;
        if(min<userNumber && userNumber<max){
            return userNumber;
        }else{
            return getInt(min,max);
        }

    }

//    static int getInt(){
//        System.out.println("Enter a Number:");
//        Input x = new Input();
//        return x.scanner.nextInt();
//
//
//    }


    static int getInt(){
            System.out.println("Enter a Number:");
            Input x = new Input();
            String y = x.scanner.nextLine();
            return Integer.valueOf(y);
    }


    static double getDouble(double min, double max){
        System.out.println("Pick a number 1 through 100:");
        Scanner sc2 = new Scanner(System.in);
        double userNumber = sc2.nextDouble();;
        if(min<userNumber && userNumber<max){
            return userNumber;
        }else{
            return getDouble(min,max);
        }
    }

    static double getDouble(){
        System.out.println("Enter a Number:");
        Input x = new Input();
        String userNumber2= x.scanner.nextLine();
        return Double.valueOf(userNumber2);
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
//
//        int c = getInt(0,101);
//        System.out.println(c);
//
//        int v = getInt();
//        System.out.println(v);
//
//        double g = getDouble(0,101);
//        System.out.println(g);
//
//        double f = getDouble();
//        System.out.println(f);

        ;

//        System.out.println(f.getScanner());


/////////////////////////////////////////////////////////
        try {
            getInt();

        }  catch(NumberFormatException nfe){
            System.out.println("Please Enter a real number");
        }

        try{
            getDouble();
        }  catch(NumberFormatException nfe){
            System.out.println("Please give a Double Type");
        }


////////////////////////////////////////////////////////////////////
        }

    }




