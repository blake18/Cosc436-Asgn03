// Base class for all characters (Player, NPC, etc.)
public abstract class Character {
    private String name;
    private int Health;

    // Default constructor
    public Character() {
        name = null;
        Health = -1;
    }

    // Constructor with name and health
    public Character(String name, int health) {
        this.name = name;
        Health = health;
    }


    // Placeholder method for now. Later, this will handle what the character does on their turn
    public void takeTurn() {
        System.out.println("Character.takeTurn() was called");
    }

    //simple getter so I can test Room.addCharacter better
     public String getName() {
        return name;
    }
}
