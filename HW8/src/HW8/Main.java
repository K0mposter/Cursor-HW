package HW8;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.takeBook(new MyLocalDate(2021, 10, 1), "I am legend");
        library.takeBook(new MyLocalDate(2021, 10, 2), "Fight club");
        library.takeBook(new MyLocalDate(2021, 10, 5), "Lullaby");

        System.out.println("Books by date " + library.getBooksByDate(new MyLocalDate(2021, 10, 1)));
        System.out.println("Books by date " + library.getBooksByDate(new MyLocalDate(2021, 10, 2)));
        System.out.println("Books by date " + library.getBooksByDate(new MyLocalDate(2021, 10, 3)));
        System.out.println("All dates " + library.getAllDates());
        System.out.println("All books " + library.getAllTheBooks());

    }
}

