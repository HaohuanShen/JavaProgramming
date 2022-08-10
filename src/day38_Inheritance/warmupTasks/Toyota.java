package day38_Inheritance.warmupTasks;

public class Toyota extends Car {
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable() {
        System.out.println(brand + " " + model + " is reliable");
    }

    public static void main(String[] args) {
        Toyota toyota1 = new Toyota("Land Cruiser", 2018, 40000, "White", 150000);


    }

}
