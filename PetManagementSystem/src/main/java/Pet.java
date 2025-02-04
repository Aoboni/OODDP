class Pet {
    private String name;
    private String breed;
    private int age;

    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("\nPet Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
    }
}
