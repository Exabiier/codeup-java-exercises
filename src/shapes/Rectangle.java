package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super.length = length;
        super.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length*2) + (2*width);
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
//    protected int length;
//    protected int width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//
//    }
//
//    public Rectangle() {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter(){
//        return (2*length) + (2*width);
//    }
//
//    public int getArea(){
//        return length*width;
//    }






}
