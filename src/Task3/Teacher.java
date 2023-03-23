package Task3;

import java.util.ArrayList;

//// 3.2
public class Teacher extends Person {
    //// 3.3
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    Teacher(String name,ArrayList<String> canTeach){
        super(name);
        this.canTeach = canTeach;
    }
    //// 3.5
    public boolean addCourse(String course){
        if(canTeach.contains(course)){
            System.out.println(this.getName()+" can teach that course");
            currentCourses.add(course);
            return true;
        }else {
            System.out.println(this.getName() + " Cant teach this course");
            return false;
        }
    }
}
