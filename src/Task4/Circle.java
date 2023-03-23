package Task4;
///  4.2
public class Circle implements Shape{
    double radius;

        Circle(double input){
            this.radius = input;
        }
    @Override
    public double getArea() {
        return (3.14)*radius*radius;
    }
}
