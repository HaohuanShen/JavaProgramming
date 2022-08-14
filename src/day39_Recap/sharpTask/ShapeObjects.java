package day39_Recap.sharpTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7.5,3.50);

        System.out.println("rectangle = " + rectangle);

        Circle circle = new Circle(3);

        System.out.println("circle = " + circle);

        Square square = new Square(4.5);

        System.out.println("square = " + square);

        System.out.println("------------------------------");

        square.setSide(5);

        System.out.println("square = " + square);

        square.setSide(-5);

        System.out.println("square = " + square);


    }

}
