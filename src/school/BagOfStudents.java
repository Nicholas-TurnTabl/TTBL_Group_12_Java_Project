package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BagOfStudents {

    List<Student> bag;

    public BagOfStudents(List<Student> bag) {
        this.bag = bag;
    }

    public BagOfStudents() {
        this.bag = new ArrayList<>();
    }

    public List<Student> getBag() {
        return bag;
    }

    public void setBag(List<Student> bag) {
        this.bag = bag;
    }


    // unique methods

    // add
    public  void add(Student newStudent){
        bag.add(newStudent);
    }

    // remove
    public void remove(Student student){
        bag.remove(student);
    }

    // clear
    public void clear(){
        bag.clear();
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagOfStudents that = (BagOfStudents) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }

    @Override
    public String toString() {
        return "BagOfStudents{" +
                "bag=" + bag +
                '}';
    }
}
