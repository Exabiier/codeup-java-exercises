package shapes;

public class Sqaure extends Quadrilateral {

    public Sqaure(int side) {
        super();
        super.length = side;
        super.width = side;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter() {
        return super.length*4;
    }

    //
//    public Sqaure(int side) {
//        super.length = side;
//        super.width = side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return super.length * 4;
//    }
//
//    @Override
//    public int getArea() {
//        return (int) Math.pow(super.length,2);
//    }








}
