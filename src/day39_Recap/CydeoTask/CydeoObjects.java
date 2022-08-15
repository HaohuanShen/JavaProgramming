package day39_Recap.CydeoTask;

public class CydeoObjects {

    public static void main(String[] args) {

        Developer developer = new Developer("David",25,'m',1998,
                "Java Developer",120000);
        Tester tester = new Tester("Oliva",27,'F',1997,"SDET",
                110000);
        Teacher teacher = new Teacher("Daniel",32,'m',1995,
                "Math Teachter",100000);
        Student student = new Student("Suhaib",25,'M',200225,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------------------------");

        developer.setAge(28);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("--------------------------------------------");
        developer.work();
        tester.work();
        teacher.work();
        student.study();

        System.out.println("----------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("---------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.creatTicket();

        System.out.println("-----------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        teacher.work();

        System.out.println("-------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();



    }
}
