package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A class representing a student.
 */
public class Student implements Nameable, HasLevel{

    // Instance variables
    String name;
    String ID;
    List<Double> gradeList;
    Level studentLevel;

    // Constructor

    public Student(String name, String ID, List<Double> grades, Level studentLevel) {
        this.name = name;
        this.ID = ID;
        this.gradeList = grades;
        this.studentLevel = studentLevel;
    }

    public Student(String name, String ID, Level studentLevel) {
        this.name = name;
        this.ID = ID;
        this.studentLevel = studentLevel;
        this.gradeList = new ArrayList<>();
    }

    // Getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Double> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Double> gradeList) {
        this.gradeList = gradeList;
    }


    // Unique methods


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }

    // TODO: Create method to add new grades

    public void addGrade(double newGrade){
        gradeList.add(newGrade);
    }

    /**
     * Function to calculate the average grade of a student.
     * @return The average score of the student.
     */
    public Double getAverageGrade(){

        double avg = 0.0;

        if (gradeList.size() == 0) {
            avg = 0.0;
//            return 0.0;
        } else{
            double sum = 0;
            for (Double grade: gradeList) {
                sum += grade;
            }

            // divide sum by total number of grades in grade list
            avg = sum/ gradeList.size();
        }

        return avg;
    }


    // Utility methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                ID.equals(student.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", grades=" + gradeList +
                '}';
    }

}
