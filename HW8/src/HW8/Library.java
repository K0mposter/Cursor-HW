package HW8;

import java.util.*;

public class Library {
    Map<MyLocalDate, String> libraryReport = new HashMap<>();

    public void takeBook(MyLocalDate myDate, String bookName) {
        libraryReport.put(myDate, bookName);
    }

    public String getBooksByDate(MyLocalDate myDate) {
        return libraryReport.getOrDefault(myDate, "There are no books for this date");
    }

    public List<String> getAllTheBooks() {
        return new ArrayList<>(libraryReport.values());
    }

    public Set<MyLocalDate> getAllDates() {
        return libraryReport.keySet();
    }
}
