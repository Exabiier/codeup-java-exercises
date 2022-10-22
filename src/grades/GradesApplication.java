package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GradesApplication {

//    entrySet() -- return a key value pair
//    while a keySet -- returns all the key pairs
//      while .get value is the value

    public static String Scanner1(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    public  static void end(HashMap<String, Student> stud){
        System.out.println(
                "Would you like to see another student?");
        String x = Scanner1();

        //////////////////////////////////////////////////////////////

        if(x.equalsIgnoreCase("y")){
            System.out.println("What student would you like to see more information on?");
            for(Map.Entry<String, Student> name: stud.entrySet()) {
                System.out.println(name.getKey());
            }
            String y = Scanner1();
            getAnswer(stud,y);
            //////////////////////////////////////////////////////////////

        } else{
            System.out.println("Cant help you!");
        }
    }


    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    public static void getAnswer(HashMap<String, Student> stud, String userInput ){

        //////////////////////////////////////////////////////////////
     if(stud.containsKey(userInput)){
         for(Map.Entry<String, Student> entry: stud.entrySet()) {

             // if give value is equal to value from entry
             // print the corresponding key
             if(entry.getKey().equalsIgnoreCase(userInput)) {
                 System.out.println("Name: " + entry.getValue().getName() + " -- " + "Github UserName: " + entry.getKey() +"\n" +
                         "Current Average: " + entry.getValue().getGradeAverage());
                 end(stud);
             }
         }

         //////////////////////////////////////////////////////////////
         //////////////////////////////////////////////////////////////
     } else{
         System.out.println("Sorry, no student found with the GitHub username of \""+userInput + "\".\n" +
                 "\n" +
                 "Would you like to see another student?");
         String x = Scanner1();

         //////////////////////////////////////////////////////////////

         if(x.equalsIgnoreCase("y")){
             System.out.println("What student would you like to see more information on?");
             for(Map.Entry<String, Student> name: stud.entrySet()) {
                 System.out.println(name.getKey());
             }
             String y = Scanner1();
             getAnswer(stud,y);
             //////////////////////////////////////////////////////////////

         } else{
             System.out.println("Cant help you!");
         }

     }





//        Map<<String, Student>
//        Optional<String> match = stud.entrySet().stream()
//                .filter(e -> userInput.equals((stud.getKey())
//                .map(Map.Entry::getKey);
//
//       return match.get();
    };

    public static void main(String[] args) {
        HashMap<String, Student> student = new HashMap<String, Student>();

        //////////////////////////////////////////////////////////////
        Student jack1 = new Student("Jack", 70);
        jack1.addGrade(80);
        jack1.addGrade(90);

        //////////////////////////////////////////////////////////////
        Student jill1 = new Student("Jill", 70);
        jill1.addGrade(85);
        jill1.addGrade(95);

        //////////////////////////////////////////////////////////////
        Student ray1 = new Student("Ray", 80);
        ray1.addGrade(90);
        ray1.addGrade(100);

        /////////////////////////////////////////////////////////////
        Student nome1 = new Student("Nome", 70);
        nome1.addGrade(85);
        nome1.addGrade(89);

        /////////////////////////////////////////////////////////////
        student.put("Jack The Ripper", jack1);
        student.put("Bro Code", jill1);
        student.put("Monster Coder", ray1);
        student.put("Black Swan", nome1);


//        if you want to print out all the keys you can use the for each method:
//        a Hasmap refereance
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        for(Map.Entry<String, Student> name: student.entrySet()) {
            System.out.println(name.getKey());
        }

        System.out.println("What student would you like to see more information on?");
        String x = Scanner1();
        getAnswer(student,x);





    }
}
