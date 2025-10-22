import java.util.ArrayList;
import java.util.List;

// Represents a room in the game that can hold characters and items
public class Room {

    String description; 
    List<Character> occupants = new ArrayList<>();
    Item item;

    // Default constructor
    public Room() {
        description = "An empty room";
        item = null;
    }
    
    // Constructor with description
    public Room(String description) {
        this.description = description;
        item = null;
    }

    // Constructor with description and an item
    public Room(String description, Item item) {
        this.description = description;
        this.item = item;
    }

    // Placeholder method for adding a character to the room
    public void addCharacter(Character gameChar) {
        System.out.println("Room.addCharacter with character " + gameChar.getName() + " was called");
    }

    // Placeholder method for adding an item to the room
    public void addItem(Item i) {
        System.out.println("Room.addItem with item " + i.getName() + " was called");
    }
}