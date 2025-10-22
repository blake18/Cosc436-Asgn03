import java.util.List;

// Represents a collection of items that a player can carry
public class Inventory {
    private List<Item> items;

    // Placeholder method for adding an item to the inventory
    public void addItem(Item i) {
        System.out.println("Inventory.addItem with item " + i.getName() + " was called");
    }
}

