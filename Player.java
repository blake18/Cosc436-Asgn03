public class Player extends Character {
    private Inventory Inventory = new Inventory();

    // Constructor that passes name and health to the Character class
    public Player(String name, int health) {
        super(name, health);
    }

    // Placeholder method for getting the player's inventory
    public Inventory getInventory() {
        System.out.println("Player.getInventory() was called");
        return Inventory;
    }

    // Placeholder method for Player actions during their turn
    public void takeTurn() {
        System.out.println("Player.takeTurn() was called");
    }

}

