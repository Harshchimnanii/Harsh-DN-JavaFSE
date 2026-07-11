// 4. ABSTRACTION (Hiding details)
abstract class Animal {
    private String name; // 1. ENCAPSULATION (Data Hiding)

    // Public Getters and Setters to access private data
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (No body, only declaration)
    abstract void makeSound();
}

// 2. INHERITANCE (Dog IS-A Animal)
class Dog extends Animal {

    // 3. POLYMORPHISM (Run-time: Overriding parent's method)
    @Override
    void makeSound() {
        System.out.println(getName() + " says: Bhow Bhow!");
    }
}

public class TheMegaCode {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Using Encapsulated methods
        myDog.setName("Sheru");

        // Polymorphism in action
        myDog.makeSound(); // Output: Sheru says: Bhow Bhow!
    }
}