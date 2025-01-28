public class Main1{
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound();  // Calls Dog's overridden method
    }
}