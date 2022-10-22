package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//
//


//        if you make an instance of a inferance with another class, you can only use methods that implements Measurable and the methods that measurable has
        Measurable Myshapes = new Sqaure(6);
        System.out.println(Myshapes.getArea());
        System.out.println(Myshapes.getPerimeter());

        Measurable Myshapes2 = new Rectangle(5,5);
        System.out.println(Myshapes2.getArea());
        System.out.println(Myshapes2.getPerimeter());










    }

}
