public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello World!");
        int myFavoriteNumber = 11;
        String myString = "Steve";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++x);
//        System.out.println(x);

        String classes;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";

//        int x = 4;
//        x = x + 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;

        y -= (x/=y);

//        there will be data loss if you go past what the data type can hold

        int max = Integer.MAX_VALUE;
    }

}
