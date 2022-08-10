package day38_Inheritance.warmupTasks;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camery",2020,20000,"Gray",123456);

        Tesla tesla= new Tesla("model s ",2019,25000,"white",50000);

        BMW bmw= new BMW("X5",2020,67350,"Black",12000);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
