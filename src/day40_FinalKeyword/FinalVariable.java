package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        final double pi = 3.14;//restrict the variable to unchangeable
        //pi=3.15;    unchangeable

        final String name;
        //name = "Java";
        //name = "Wooden Spoon"; can not reassign the variable name

        FinalVariable obj = new FinalVariable("May/01");

        //obj.birthday = "June/01";  final variable can not be reassigned

        System.out.println(obj.birthday);

        System.out.println("---------------------------------------");

        System.out.println(FinalVariable.name);

    }
}
