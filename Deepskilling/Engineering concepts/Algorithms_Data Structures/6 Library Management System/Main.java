import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Algorithms", "Robert Sedgewick"),
                new Book(104, "Operating Systems", "Galvin"),
                new Book(105, "Computer Networks", "Andrew Tanenbaum")

        };

        System.out.println("Linear Search:");

        Book result1 = SearchOperations.linearSearch(books, "Algorithms");

        if (result1 != null)

            System.out.println(result1);

        else

            System.out.println("Book Not Found");

        // Sort Array by Title
        Arrays.sort(books, Comparator.comparing(book -> book.title));

        // Binary Search
        System.out.println("\nBinary Search:");

        Book result2 = SearchOperations.binarySearch(books, "Algorithms");

        if (result2 != null)

            System.out.println(result2);

        else

            System.out.println("Book Not Found");
    }
}