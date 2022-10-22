package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


//////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //////////////////////////////////////////////////////////////////

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    //////////////////////////////////////////////////////////////////


    public Student(String name, int grades) {
        this.name = name;
        this.grades = new ArrayList<>(Arrays.asList(grades));
    }


    //////////////////////////////////////////////////////////////////

    // returns the student's name


    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    };


    // returns the average of the students grades
    public double getGradeAverage(){
//        this.grades = doubles;
        double doublesSum = this.grades.stream()
                .mapToDouble(Integer::doubleValue)
                .sum();
        return (doublesSum/this.grades.size());
    };




}
