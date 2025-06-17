// Instrument.java (Abstract Base Class)
abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void playSound();
}

// Piano.java
class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println(name + " plays a beautiful melody with keys (Ding dong!).");
    }
}

// Guitar.java
class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println(name + " strums a rhythmic chord (Strummm!).");
    }
}

// Violin.java
class Violin extends Instrument {
    public Violin(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println(name + " produces a soulful sound with a bow (Vrooooom!).");
    }
}

// MusicApp.java (Main Class)
public class MusicApp {
    public static void main(String[] args) {
        Instrument piano = new Piano("Grand Piano");
        Instrument guitar = new Guitar("Acoustic Guitar");
        Instrument violin = new Violin("Stradivarius Violin");

        System.out.println("--- Playing Instruments ---");
        piano.playSound();
        guitar.playSound();
        violin.playSound();

        // Demonstrating polymorphism in a collection
        System.out.println("\n--- Orchestra Practice ---");
        Instrument[] orchestra = new Instrument[3];
        orchestra[0] = new Piano("Upright Piano");
        orchestra[1] = new Guitar("Electric Guitar");
        orchestra[2] = new Violin("Student Violin");

        for (Instrument inst : orchestra) {
            inst.playSound(); // Each instrument plays its unique sound
        }
    }
}