package mathPackage;

public class Mathematics {
    private int resultAddition, resultSubtraction, resultMultiplication;
    private float resultDivision;

    public void addition(int a, int b) {
        resultAddition = a + b;
    }

    public void subtraction(int a, int b) {
        resultSubtraction = a - b;
    }

    public void multiplication(int a, int b) {
        resultMultiplication = a * b;
    }

    public void division(float a, float b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            resultDivision = 0; // You can change the return value as needed.
        }
        resultDivision = a / b;
    }

    public int getAdditionResult() {
        return resultAddition;
    }

    public int getSubtractionResult() {
        return resultSubtraction;
    }

    public int getMultiplicationResult() {
        return resultMultiplication;
    }

    public float getDivisionResult() {
        return resultDivision;
    }
}
