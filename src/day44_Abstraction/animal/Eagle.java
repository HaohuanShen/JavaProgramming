package day44_Abstraction.animal;

public class Eagle extends Animal {

    public Eagle(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats rabbit");
    }
}
