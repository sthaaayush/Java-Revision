package Day2;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cock extends Animal {
    @Override
    public void sound() {
        System.out.println("Cockadoodle");
    }

    public void product() {
        System.out.println("egg");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Cock();
        animal.sound(); // Calls the overridden method in Cock

        // Downcasting
        if (animal instanceof Cock) {
            Cock cock = (Cock) animal;
            cock.sound(); // Calls the overridden method in Cock
            cock.product(); // Calls the method specific to Cock
        }
    }
}
