import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        String we = "We don't need no education\n" +
                "We don't need no thought control";
        System.out.println(we);

        String check = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(check);

        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);

        String backslash = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(backslash);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ask bob something:\n");
        String bobInput = sc.nextLine();

        if(bobInput.contains("?")){
            System.out.println("Sure.");
        } else if(bobInput.contains("!")){
            System.out.println("Whoa, chill out");
        } else if(bobInput.length() == 0 ){
            System.out.println("Fine. Be that way");
        } else{
            System.out.println("Whatever.");
        }









    }
}
