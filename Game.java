// Character.java (Base Class)
class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " performs a basic attack.");
    }
}

// Warrior.java (Derived Class)
class Warrior extends Character {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a mighty sword!");
    }
}

// Mage.java (Derived Class)
class Mage extends Character {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a powerful fire spell!");
    }
}

// Game.java (Main Class)
public class Game {
    public static void main(String[] args) {
        Character genericChar = new Character("Hero");
        Warrior warrior = new Warrior("Arthur");
        Mage mage = new Mage("Merlin");

        System.out.println("--- Character Attacks ---");
        genericChar.attack();
        warrior.attack();
        mage.attack();

        // Demonstrating polymorphism
        System.out.println("\n--- Polymorphic Attacks ---");
        Character[] party = new Character[3];
        party[0] = new Warrior("Lancelot");
        party[1] = new Mage("Gandalf");
        party[2] = new Character("Villager"); // A generic character

        for (Character member : party) {
            member.attack(); // Calls the overridden method based on the actual object type
        }
    }
}