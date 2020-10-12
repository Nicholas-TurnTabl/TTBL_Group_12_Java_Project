package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericBag<T> {

    List<T> bag;

    public GenericBag(List<T> bag) {
        this.bag = bag;
    }

    public GenericBag() {
        this.bag = new ArrayList<>();
    }

    public List<?> getBag() {
        return bag;
    }

    public void setBag(List<T> bag) {
        this.bag = bag;
    }


    // unique methods

    // add
    public  void add(T t){
        bag.add(t);
    }

    // remove
    public void remove(T t){
        bag.remove(t);
    }

    // clear
    public void clear(){
        bag.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericBag<?> that = (GenericBag<?>) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }

    @Override
    public String toString() {
        return "GenericBag{" +
                "bag=" + bag +
                '}';
    }
}
