package Task4;
///  4.2
public class Square implements Shape{
    double sideLength;
    Square(double input){
        sideLength = input;
    }
    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
}
