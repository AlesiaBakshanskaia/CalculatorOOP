package model;

public interface Calculable {
    ComplexNumber sum(ComplexNumber firstNumber, ComplexNumber secondNumber);
    ComplexNumber multipl(ComplexNumber firstNumber, ComplexNumber secondNumber);
    ComplexNumber division(ComplexNumber firstNumber, ComplexNumber secondNumber);

}
