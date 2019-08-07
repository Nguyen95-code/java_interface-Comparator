public class Circle extends Shape {
    public double radius=1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*Math.PI*2;
    }

    @Override
    public String toString() {
        return "A circle with radius ="+this.radius+" ,which is a subclass of "+super.toString();
    }
}
