/*A restaurant wants to keep track of its menu items. Each menu item has a name, a description, a price, and a category (appetizer, main course, dessert, etc.). The restaurant wants to be able to perform the following operations:
Add a new menu item to the menu
Remove a menu item from the menu
Search for a menu item by name or category
Display all the menu items in the menu, grouped by category
To implement this functionality, you decide to use a collection in Java.
Question: Write a Java program that implements the above scenario using a collection. Your program should have a MenuItem class that stores the details of a menu item (name, description, price, and category). Implement a collection to store the menu items in the restaurant's menu. Your program should have methods to add a menu item, remove a menu item, search for a menu item by name or category, and display all the menu items grouped by category. Test your program by adding several menu items to the menu, searching for a menu item, and displaying all the menu items grouped by category.
  */
import java.util.*;

class MenuItems {
    String name;
    String description;
    float price;
    String category;

MenuItems(String name, String description, float price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

  
  void BreakfastItems() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Idly");
        list.add("Dosa");
        list.add("Upma");
        list.add("Chapathi");
        System.out.println(list);
        System.out.println("Wednesday Special:");
        list.add("Porota");
        System.out.println(list);
}

    void LunchItems() {
        ArrayList<String> list=new ArrayList<String>();
        list.add("White Rice");
        list.add("Curd Rice");
        list.add("Vegetable Pulav");
        list.add("Podina Rice");
        System.out.println(list);
    }

    void Snacks() {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Bajji");
        list.add("Egg Bujji");
        list.add("Bonda");
        list.add("Samosa");
        System.out.println(list);
    }

    void Display() {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select the following category:");
            System.out.println("1.Breakfast Items");
            System.out.println("2.Lunch Items");
            System.out.println("3.Snacks");
            System.out.println("0.Exit");
            choice = sc.nextInt();

 switch (choice) {
        case 1:
            System.out.println("Breakfast Items:");
              BreakfastItems();
              break;
        case 2:
           System.out.println("Lunch Items:");
            LunchItems();
            break;
      case 3:
          System.out.println("Snacks:");
          Snacks();
          break;
      case 0:
            System.exit(0);
      default:
           System.out.println("Invalid Choice");
           break;
            }
        } while (true);
    }
}

class C20Fri {
    public static void main(String[] args) {
    MenuItems MI = new MenuItems("Idly", "South Indian steamed rice cake", 30.00f, "Breakfast Items");
       MI.Display();
    }
}
