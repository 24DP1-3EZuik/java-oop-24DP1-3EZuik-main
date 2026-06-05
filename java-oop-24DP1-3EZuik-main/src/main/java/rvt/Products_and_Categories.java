package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products_and_Categories {
    private List<Product> products;
    private List<Category> categories;

    public Products_and_Categories() {
        products = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public static void main(String[] args) {
        Products_and_Categories pac = new Products_and_Categories();
        Scanner scanner = new Scanner(System.in);

        // Adding some categories
        pac.addCategory(new Category("Electronics"));
        pac.addCategory(new Category("Books"));
        pac.addCategory(new Category("Clothing"));

        // Adding some products
        pac.addProduct(new Product("Laptop", 999.99, pac.getCategories().get(0)));
        pac.addProduct(new Product("Novel", 19.99, pac.getCategories().get(1)));
        pac.addProduct(new Product("T-Shirt", 29.99, pac.getCategories().get(2)));

        // Displaying products and their categories
        System.out.println("Products and their Categories:");
        for (Product product : pac.getProducts()) {
            System.out.println(product.getName() + " - " + product.getCategory().getName());
        }
        
        scanner.close();
    }
}