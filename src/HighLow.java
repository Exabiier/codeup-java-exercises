import java.util.Scanner;
import java.lang.Math;

public class HighLow {


    public static void pickNum(int rand, int userInput) {
        System.out.println("Pick another number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        userInput = user;

        if (rand < userInput) {
            System.out.println("Lower");
            pickNum(rand, userInput);
        } else if (rand > userInput) {
            System.out.println("Higher");
            pickNum(rand, userInput);
        } else if (rand == userInput) {
            System.out.println("Good Guess");
        }
    }


    public static void main(String[] args) {
//        random number is choosen
        int rand = (int)(Math.random()*100+1);
        System.out.println("random number is");
        System.out.println(rand);


//        scanner for the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100");
        int userInput = sc.nextInt();


       pickNum(rand,userInput);





    }


}
