package opg4;

public class Square implements Shape {
    double lenght;
    public Square(double lenght){
        this.lenght=lenght;

    }
    @Override
    public double getArea() {
        return lenght*lenght;
    }
}
