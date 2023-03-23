package Task3;

//// 3.1
public abstract class Person {
    String name;

        Person(String name){
            this.name = name;
        }


    public String getName(){
            return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract boolean addCourse(String course);
}
