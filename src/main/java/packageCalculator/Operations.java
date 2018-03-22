package packageCalculator;

import java.io.PrintStream;

public class Operations {
    private Double numberOne;
    private Double numberTwo;
    private char operation;

    public Operations(Double numberOne, Double numberTwo, char operation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public static PrintStream getAddition(Double numberOne, Double numberTwo) {
        Double countAddition = numberOne + numberTwo;
        return System.out.printf("%s + %s = %s%n", +numberOne, numberTwo, countAddition);
    }

    public static PrintStream getSubtraction(Double numberOne, Double numberTwo) {
        Double countSubtraction = numberOne - numberTwo;
        return System.out.printf("%s - %s = %s%n", +numberOne, numberTwo, countSubtraction);
    }

    public static PrintStream getDivision(Double numberOne, Double numberTwo) throws ExceptionDivisor {

        if (numberTwo == 0) throw new ExceptionDivisor("divisor must not be zero", numberTwo);
        Double countDivision = numberOne / numberTwo;
        return System.out.printf("%s / %s = %s%n", +numberOne, numberTwo, countDivision);

    }

    public static PrintStream getMultiplication(Double numberOne, Double numberTwo) {
        Double countMultiplication = numberOne * numberTwo;
        return System.out.printf("%s * %s = %s%n", +numberOne, numberTwo, countMultiplication);
    }
}
