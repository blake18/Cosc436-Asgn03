// Represents an item that can be found or used in the game
public class Item {
    String name;

    // Default constructor
    public Item() {
        name = null;
    }

    // Constructor that sets the item's name
    public Item(String name) {
        this.name = name;
    }

    // Placeholder method for interaction
    public void interact() {
        System.out.println("Item.interact() method was called");
    }

    //Simple getter for testing invetory.getItem better 
    public String getName() {
        return name;
    }
}


