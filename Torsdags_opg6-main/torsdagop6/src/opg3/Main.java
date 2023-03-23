package opg3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("dansk");
        passedCourses.add("mat");
        passedCourses.add("eng");
        passedCourses.add("Java 1.0");

        ArrayList<String> crrentCoursesS = new ArrayList<>();
        Student s1 = new Student("anme", passedCourses, crrentCoursesS);


        ArrayList<String> crrentCoursesT = new ArrayList<>();


        ArrayList<String> canTeach = new ArrayList<>();

        canTeach.add("dansk");
        canTeach.add("mat");
        canTeach.add("eng");
        canTeach.add("Java 1.0");
        Teacher t1 = new Teacher("adams", canTeach, crrentCoursesT);
        Teacher t2 = new Teacher("dibs", canTeach, crrentCoursesT);

        ArrayList<Person> persons = new ArrayList<>();


        persons.add(s1);
        persons.add(t1);
        persons.add(t2);


        for (Person p : persons) {
            p.addCourse("Java 1.0");

        }

    }
}
