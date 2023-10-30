package mathematics;

import mathPackage.Mathematics2;
import mathPackage.Mathematics;

public class InheritanceExample {

    public static void main(String[] args) {
        Mathematics math1 = new Mathematics();
        Mathematics2 math2 = new Mathematics2();

        math1.addition(23, 8);
        math1.subtraction(23, 8);
        math1.multiplication(23, 8);
        math1.division(23, 8);
        math2.modulus(23, 8);

        System.out.println("Addition result = " + math1.getAdditionResult());
        System.out.println("Subtraction result = " + math1.getSubtractionResult());
        System.out.println("Multiplication result = " + math1.getMultiplicationResult());
        System.out.println("Division result = " + math1.getDivisionResult());
        System.out.println("Modulus result = " + math2.getModulusResult());
    }
}
