package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.name2);//protected is visible outside package in subclasses only

        ProtectedAccessModifier.method2();

    }
}
