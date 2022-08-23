package day41_Exception;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;


        try {
            System.out.println(employee.getSalary());// Null pointer exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }

        System.out.println("Tested Completed");

        System.out.println("--------------------------------------");


        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
