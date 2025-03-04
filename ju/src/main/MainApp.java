package main;
import user.User;
import user.UserManager;
import item.Item;
import item.ItemManager;
public class MainApp {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser(new User("Alice", 25));
        userManager.addUser(new User("Bob", 30));
        ItemManager itemManager = new ItemManager();
        itemManager.addItem(new Item("Laptop", 1200.50));
        itemManager.addItem(new Item("Phone", 699.99));
        System.out.println("Users:");
        userManager.displayUsers();
        System.out.println("\nItems:");
        itemManager.displayItems();
    }
}
