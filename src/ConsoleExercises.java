import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput1 = scanner.nextLine();

        System.out.printf("You entered %d%n", userInput1);
        System.out.println("Enter three words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);



//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");

        String userInput2 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        String userInput3 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        System.out.println("Enter a Sentance: ");
        String userInput4 = scanner.nextLine();
        System.out.printf("Your Sentance:", userInput4);

        System.out.println("Let's find the the area");
//        rectangle measurement
        System.out.println("Enter the height: ");
        String height = scanner.nextLine();

        System.out.println("Enter the Width: ");
        String width = scanner.nextLine();

        System.out.println("Enter the length: ");
        String length = scanner.nextLine();

        double height2 = Integer.parseInt(height);
        double Width2 = Integer.parseInt(width);
        double answer = 2*height2+2*Width2;

        double length2 = Integer.parseInt(length);
        double answer2 = height2*Width2*length2;

        System.out.printf("The perimeter of your classroom is %.2f%n", answer);
        System.out.printf("The perimeter of your classroom is %.2f%n", answer2);
    }
}
