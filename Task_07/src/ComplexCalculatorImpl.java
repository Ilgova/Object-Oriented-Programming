import java.util.logging.Logger;

class ComplexCalculatorImpl implements ComplexCalculator {
    private static Logger logger = Logger.getLogger(ComplexCalculatorImpl.class.getName());

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
        logger.info("Addition operation performed: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.info("Multiplication operation performed: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.info("Division operation performed: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
