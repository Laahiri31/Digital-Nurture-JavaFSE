import java.util.HashMap;

public class Inventory {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int id, String name, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product product = inventory.get(id);

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }
    }

    // Delete Product
    public void deleteProduct(int id) {

        if (inventory.remove(id) != null)

            System.out.println("Product Deleted Successfully.");

        else

            System.out.println("Product Not Found.");
    }

    // Display Inventory
    public void displayProducts() {

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");

        } else {

            for (Product product : inventory.values()) {

                System.out.println(product);

            }
        }
    }
}