package shapes;

abstract class Quadrilateral extends shapes implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral() {
        this.length = length;
        this.width = width;
    }

    //these are the getters of the project
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

// these are the abstract setters for the project


    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}