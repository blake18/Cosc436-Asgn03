
import java.util.ArrayList;
import java.util.List;

public class Room {

    String description; 
    List<Character> occupants = new ArrayList<>();
    Item item;

    public Room() {
        description = "A empty room";
        item = null;
    }
    
    public Room(String description) {
        this.description = description;
        item = null;
    }

    public Room(String description, Item item) {
        this.description = description;
        this.item = item;
    }

    public static void addCharacter(Character gameChar){
        System.out.println("Room.addCharacrter with character " + gameChar + " was called");
    }

    public static void addItem(Item i){
        System.out.println("Room.addItem with Item " + i + " was called");
    }
}
