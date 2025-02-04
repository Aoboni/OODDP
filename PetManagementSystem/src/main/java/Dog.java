class Dog extends Pet {
    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void bark() {
        System.out.println(getName() + " is barking! 🐶");
    }
}

