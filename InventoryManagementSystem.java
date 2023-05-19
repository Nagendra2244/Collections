/*Implement a program to simulate a basic inventory management system. It should include functionalities like adding products, updating quantities, checking stock levels, and generating reports.*/

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Integer> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            int currentQuantity = inventory.get(productName);
            inventory.put(productName, currentQuantity + quantity);
        } else {
            inventory.put(productName, quantity);
        }
        System.out.println("Product added: " + productName + ", Quantity: " + quantity);
    }

    public void updateQuantity(String productName, int newQuantity) {
        if (inventory.containsKey(productName)) {
            inventory.put(productName, newQuantity);
            System.out.println("Quantity updated: " + productName + ", New Quantity: " + newQuantity);
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public int checkStockLevel(String productName) {
        if (inventory.containsKey(productName)) {
            return inventory.get(productName);
        } else {
            System.out.println("Product not found: " + productName);
            return 0;
        }
    }

    public void generateReport() {
        System.out.println("Inventory Report:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String productName = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product: " + productName + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

        // Adding products to the inventory
        inventoryManagementSystem.addProduct("Apple", 10);
        inventoryManagementSystem.addProduct("Banana", 5);
        inventoryManagementSystem.addProduct("Orange", 7);

        // Updating quantities
        inventoryManagementSystem.updateQuantity("Apple", 15);
        inventoryManagementSystem.updateQuantity("Banana", 3);

        // Checking stock levels
        int appleStockLevel = inventoryManagementSystem.checkStockLevel("Apple");
        int orangeStockLevel = inventoryManagementSystem.checkStockLevel("Orange");

        System.out.println("Apple Stock Level: " + appleStockLevel);
        System.out.println("Orange Stock Level: " + orangeStockLevel);

        // Generating inventory report
        inventoryManagementSystem.generateReport();
    }
}
