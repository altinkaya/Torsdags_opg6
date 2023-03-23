package opg4;

public class Circle implements Shape {

    double radius;
    public Circle(double radius){
        this.radius=radius;

    }
    @Override
    public double getArea() {
        return 3.14*(radius*radius);
    }
}
