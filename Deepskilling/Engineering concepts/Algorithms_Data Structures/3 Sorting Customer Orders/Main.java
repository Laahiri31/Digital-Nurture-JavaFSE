public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 8500),
                new Order(103, "Arjun", 4200),
                new Order(104, "Sneha", 1500),
                new Order(105, "Rohan", 6200)

        };

        // Bubble Sort
        System.out.println("Orders After Bubble Sort:");

        Sorting.bubbleSort(orders);

        Sorting.display(orders);

        // New Array for Quick Sort
        Order[] orders2 = {

                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 8500),
                new Order(103, "Arjun", 4200),
                new Order(104, "Sneha", 1500),
                new Order(105, "Rohan", 6200)

        };

        System.out.println("\nOrders After Quick Sort:");

        Sorting.quickSort(orders2, 0, orders2.length - 1);

        Sorting.display(orders2);
    }
}