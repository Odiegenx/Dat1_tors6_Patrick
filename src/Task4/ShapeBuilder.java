package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> list = new ArrayList<>();

        ShapeBuilder(){

        }
/// 4.3
        public void addShape(Shape s){
            list.add(s);
        }
/// 4.4
        public double getTotalArena(){
            double totalArea = 0;
            for(Shape s: list){
                totalArea += s.getArea();
            }
            return totalArea;
        }
}
