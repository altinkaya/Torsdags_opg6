package opg3;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;



    public Teacher(String name,ArrayList<String> canTeach, ArrayList<String> currentCourses){

        super(name);
        this.currentCourses=currentCourses;
        this.canTeach=canTeach;


    }

    @Override
    public boolean addCourse(String course) {
        for (String s : canTeach)
            if (s.equals(course)) {
                currentCourses.add(course);
                System.out.println(this.name + " kan undervise i dette fag");
                return true;

            }

System.out.println(this.name + "kan ikke undervise i dette fag");
        return false;
    }
}
