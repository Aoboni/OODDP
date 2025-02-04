class PetShop {
    public void buyPet(Pet pet) {
        System.out.println("\nYou have purchased a " + pet.getBreed() + " named " + pet.getName() + "!");
    }

    public void showPetInfo(Pet pet) {
        pet.displayInfo();
    }
}
