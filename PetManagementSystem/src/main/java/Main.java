public class Main {
    public static void main(String[] args) {
        // Create Pet objects
        Dog dog = new Dog("Buddy", "Golden Retriever", 3);
        Cat cat = new Cat("Kitty", "Persian", 2);

        // Display Pet Information
        dog.displayInfo();
        dog.bark();

        cat.displayInfo();
        cat.meow();

        // Pet Care Service
        PetCare care = new PetCare();
        care.provideCareTips();

        // Pet Shop Purchase
        PetShop shop = new PetShop();
        shop.buyPet(dog);
        shop.showPetInfo(cat);
    }
}
