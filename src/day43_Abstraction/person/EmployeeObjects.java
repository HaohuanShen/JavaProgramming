package day43_Abstraction.person;

public class EmployeeObjects {
    public static void main(String[] args) {

        //Person person = new Person("Josh",35,'M'); abstraction can not creat objects

        Tester tester = new Tester("Ali", 30, 'f', 20152, "SDET", 12000);
        Developer developer = new Developer("Alex", 22, 'M', 20124, "Web developer", 150000);

        System.out.println(tester);
        System.out.println(developer);

        tester.work();
        developer.work();
        tester.bugReport();
        developer.unitTest();


    }
}
