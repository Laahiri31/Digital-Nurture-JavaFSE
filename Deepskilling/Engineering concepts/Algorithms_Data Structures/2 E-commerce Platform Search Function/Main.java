import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(110, "Shoes", "Fashion"),
                new Product(101, "Keyboard", "Electronics"),
                new Product(108, "Watch", "Accessories")

        };

        // Linear Search
        System.out.println("Linear Search:");

        Product result1 = SearchOperations.linearSearch(products, 110);

        if (result1 != null)

            System.out.println(result1);

        else

            System.out.println("Product Not Found");

        // Sort Array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\nBinary Search:");

        Product result2 = SearchOperations.binarySearch(products, 110);

        if (result2 != null)

            System.out.println(result2);

        else

            System.out.println("Product Not Found");
    }
}