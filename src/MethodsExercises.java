import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

//    public static int addition(int x, int y){
//        return x +y;
//    }
//
//    public static int sub(int x, int y){
//        return x - y;
//    }
//
//    public static int multi(int x, int y){
//        return x * y;
//    }
//
//    public static int div(int x, int y){
//        return x/y;
//    }
//
//    public static int mod(int x, int y){
//        return x%y;
//    }

    public static int getInteger(int min , int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that is between 1 - 10");
        int userInput = sc.nextInt();
        if(min < userInput && userInput < max ){
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }

    public static int getfactorial(int userInput){
        int count = 1;
        for(int i = 1; i <userInput + 1; i++){
            count *= i;
        }
        return count;

    }

    public static void diceRool(){

        while (true)
        {
            int diceX=(int)(Math.random()*6+1);
            int diceY=(int)(Math.random()*6+1);
            int sum1 = diceX + diceY;
            System.out.println("Roll: total = " + sum1);
            if (sum1==2 || sum1==3 || sum1==12) {
                System.out.println("Sorry with a " + sum1 + " You LOSE :(");
                break;
            } else if(sum1==7 || sum1==11) {
                System.out.println("Woah!!! With a " + sum1 + " You WIN!!!!!!!");
                break;
            }
        }
    };







    public static void main(String[] args) {
//        int x = addition(4, 5);
//        System.out.println(x);
//
//        int y = sub(4, 5);
//        System.out.println(y);
//
//        int z = multi(4, 5);
//        System.out.println(z);
//
//        int a = div(4, 5);
//        System.out.println(a);
//
//        int b = mod(5,6);
//        System.out.println(b);

//   int x = getInteger(1,10);
//   int y = getfactorial(x);
//        System.out.println(y);

        diceRool();




    }

}
