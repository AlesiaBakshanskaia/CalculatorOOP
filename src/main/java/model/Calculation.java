package model;

public class Calculation implements Calculable{

    @Override
    public ComplexNumber sum(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        return new ComplexNumber(firstNumber.getRealNumber() + secondNumber.getRealNumber(),
                firstNumber.getImaginaryNumber() + secondNumber.getImaginaryNumber());
    }

    @Override
    public ComplexNumber multipl(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        float realPart = firstNumber.getRealNumber() * secondNumber.getRealNumber() -
                firstNumber.getImaginaryNumber() * secondNumber.getImaginaryNumber();
        float imaginPart = firstNumber.getRealNumber() * secondNumber.getImaginaryNumber() +
                firstNumber.getImaginaryNumber() * secondNumber.getRealNumber();
        return new ComplexNumber(realPart, imaginPart);
    }

    @Override
    public ComplexNumber division(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        float realPart = (firstNumber.getRealNumber() * secondNumber.getRealNumber() +
                firstNumber.getImaginaryNumber() * secondNumber.getImaginaryNumber()) /
                (secondNumber.getRealNumber() * secondNumber.getRealNumber() +
                        secondNumber.getImaginaryNumber() * secondNumber.getImaginaryNumber());
        float imaginPart = (secondNumber.getRealNumber() * firstNumber.getImaginaryNumber() -
                firstNumber.getRealNumber() * secondNumber.getImaginaryNumber()) /
                (secondNumber.getRealNumber() * secondNumber.getRealNumber() +
                        secondNumber.getImaginaryNumber() * secondNumber.getImaginaryNumber());
        return new ComplexNumber(realPart, imaginPart);
    }

}
