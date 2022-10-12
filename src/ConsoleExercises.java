import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput1 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput1 + "\" <--");

        String userInput2 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        String userInput3 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        System.out.println("Enter a Sentance: ");
        String userInput4 = scanner.nextLine();
        System.out.println(userInput4);

        System.out.println("Let's find the the area");
//        rectangle measurement
        System.out.println("Enter the height: ");
        String height = scanner.nextLine();

        System.out.println("Enter the Width: ");
        String width = scanner.nextLine();

        double height2 = Integer.parseInt(height);
        double Width2 = Integer.parseInt(width);
        double answer = 2*height2+2*Width2;

        System.out.println(answer);
    }
}
