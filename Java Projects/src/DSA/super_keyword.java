package DSA;

public class super_keyword {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}

// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Subclass
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Invoking the superclass constructor
        this.breed = breed;
    }

    void display() {
        super.display(); // Calling the superclass method
        System.out.println("Dog Breed: " + breed);
    }
}





