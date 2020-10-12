package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BagOfLecturers {

    List<Lecture> bag;

    public BagOfLecturers(List<Lecture> bag) {
        this.bag = bag;
    }

    public BagOfLecturers() {
        bag = new ArrayList<>();
    }

    // unique methods

    // add
    public  void add(Lecture newLecture){
        bag.add(newLecture);
    }

    // remove
    public void remove(Lecture lecture){
        bag.remove(lecture);
    }

    // clear
    public void clear(){
        bag.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BagOfLecturers that = (BagOfLecturers) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }

    @Override
    public String toString() {
        return "BagOfLecturers{" +
                "bag=" + bag +
                '}';
    }
}
