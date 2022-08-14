package day39_Recap.CydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void creatTicket(){
        System.out.println(getJobTitle()+": "+getName()+" is creating ticket");
    }



}
