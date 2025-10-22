// Represents a non-player character (NPC) in the game
public class NPC extends Character {

    // Constructor that passes name and health to the Character class
    public NPC(String name, int health) {
        super(name, health);
    }

    // Placeholder method for NPC actions during their turn
    public void takeTurn() {
        System.out.println("NPC.takeTurn() was called");
    }

    // Placeholder method for NPC interaction
    public void interact() {
        System.out.println("NPC.interact() was called");
    }
}

