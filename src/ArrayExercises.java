import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

//    add one additional array
    public static Person[] addPerson(Person[] names){

//      make a new array with size you wnat
        Person[] add  = new Person[names.length+1];

//      copy the contents of old array over
        for (int i = 0; i < names.length; i++) {
            add[i] = names[i];
        }

//        ask the user what they want when they add an element in the array

        Scanner in = new Scanner(System.in);

        System.out.println("Enter new word: ");
        String name = in.nextLine();
        add[add.length -1] = new Person(name);

        return add;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] names = {new Person("jake"), new Person("Will"), new Person("Frank")};
        Person [] go = addPerson(names);
        for (Person i : go) {
            System.out.println(i.name);
        }
    }
}

