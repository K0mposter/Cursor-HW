package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MyList<T extends Number> {

    private final List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public Optional<T> smallest() {
        return list.stream().sorted().findFirst();
    }

    public Optional<T> largest() {
        return list.stream().min(Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return "MyList " + list;

    }
}