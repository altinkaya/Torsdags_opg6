package opg3;

public abstract class Person {
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract boolean addCourse(String course);


}
