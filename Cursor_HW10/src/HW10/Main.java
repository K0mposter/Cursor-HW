package HW10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static HW10.Gender.Male;
import static HW10.Gender.Female;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Oleksii", 26, Male),
                new Person("Ezio", 65, Male),
                new Person("Grzegorz", 45, Male),
                new Person("Penny", 40, Female),
                new Person("Bernadette", 16, Female),
                new Person("Howard", 28, Male),
                new Person("Leonard", 30, Male)
        ));
        Stream<Person> filteredStream = personList.stream()
                .filter(person -> person.getAge()>=18 && person.getAge()<60);
        filteredStream.forEach(System.out::println);

    }

}
