package packageCalculator;


public class ExceptionDivisor extends Exception {
    private double divisor;

    public ExceptionDivisor(String message, double numberTwo) {
        super(message);
        divisor = numberTwo;
    }


}
