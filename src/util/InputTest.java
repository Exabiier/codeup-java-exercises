package util;

public class InputTest {

    public static void main(String[] args) {


        Input.yesNo();
        Input.getString();
        int x = Input.getInt(0,101);
        System.out.println(x);
        int z = Input.getInt();
        System.out.println(z);
        double c = Input.getDouble(0,10);
        System.out.println(c);
        double b = Input.getDouble();
        System.out.println(b);
    }


}
