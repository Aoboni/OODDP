class Cat extends Pet {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void meow() {
        System.out.println(getName() + " is meowing! 🐱");
    }
}
