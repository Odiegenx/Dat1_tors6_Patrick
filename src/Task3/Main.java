package Task3;

import java.util.ArrayList;

//// 3.6
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> s1PassedCourses = new ArrayList<>();
        s1PassedCourses.add("Danish");
        s1PassedCourses.add("Math");
        s1PassedCourses.add("English");
        Student s1 = new Student("Frodo",s1PassedCourses);

        ArrayList<String> s2PassedCourses = new ArrayList<>();
        s2PassedCourses.add("Danish");
        s2PassedCourses.add("Math");
        s2PassedCourses.add("Java 1.0");
        Student s2 = new Student("Sam",s2PassedCourses);

        ArrayList<String> t1CanTeach = new ArrayList<>();
        t1CanTeach.add("Danish");
        t1CanTeach.add("Math");
        t1CanTeach.add("English");
        Teacher t1 = new Teacher("Gerda",t1CanTeach);
        ArrayList<String> t2CanTeach = new ArrayList<>();
        t2CanTeach.add("Danish");
        t2CanTeach.add("Math");
        t2CanTeach.add("English");
        t2CanTeach.add("Java 1.0");
        Teacher t2 = new Teacher("Hans",t2CanTeach);

        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

//// 3.7
        for(Person p: persons){
                System.out.println(p.addCourse("Java 1.0"));
            }
        }


}
