package HW10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static HW10.GENDER.FEMALE;
import static HW10.GENDER.MALE;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Oleksii", 26, MALE),
                new Person("Ezio", 65, MALE),
                new Person("Grzegorz", 45, MALE),
                new Person("Penny", 40, FEMALE),
                new Person("Bernadette", 16, FEMALE),
                new Person("Howard", 28, MALE),
                new Person("Leonard", 30, MALE)
        ));
        Stream<Person> filteredStream = personList.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60);
        filteredStream.forEach(System.out::println);

    }

}
