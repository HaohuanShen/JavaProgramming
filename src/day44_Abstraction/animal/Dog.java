package day44_Abstraction.animal;

public final class Dog extends Animal{


    public Dog(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats pizza");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
