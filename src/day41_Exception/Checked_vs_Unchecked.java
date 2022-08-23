package day41_Exception;

import day39_Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(a/b);//compile can not check it automatically. the error
        //will be found only when we run it.

        char[] characters = {'A','B','C'};
        //                    0   1   2

        //System.out.println(characters[99]); compile can not check it automatically,the error will be found only when run it

        /*
        Student student = null;

         System.out.println(student.getName());//this is no instance in student object.

         */

        //checked Exception:

        System.out.println("Hello");

        //Thread.sleep(3000); checked exception, you can not run it without handle it immediately

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file");

    }
}
