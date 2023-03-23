package Task3;

import java.util.ArrayList;

//// 3.2
public class Student extends Person {
    //// 3.3
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

        Student(String name, ArrayList<String> passedCourses){
            super(name);
            this.passedCourses = passedCourses;
        }
//// 3.4
    public boolean addCourse(String course){
            /*for(String s: passedCourses){
                if(s.equals(course)){
                    System.out.println("You have already passed this course");
                    return false;
                }
            }*/
            if(passedCourses.contains(course)){
                System.out.println(this.getName()+" already passed this course");
                return false;
            }else {
                System.out.println(this.getName() + " has been added to the course");
                currentCourses.add(course);
                return true;
            }
    }
}
