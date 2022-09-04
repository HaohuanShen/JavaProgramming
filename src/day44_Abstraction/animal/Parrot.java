package day44_Abstraction.animal;

public final class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats cholate");
    }
}
