package HW8;

import java.time.LocalDate;
import java.util.Objects;

public class MyLocalDate {
    private final LocalDate myDate;

    public MyLocalDate(int year, int month, int day) {
        myDate = LocalDate.of(year, month, day);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLocalDate that = (MyLocalDate) o;
        return Objects.equals(myDate, that.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myDate);
    }

    @Override
    public String toString() {
        return myDate.toString();
    }

}
