package presenter;

import logger.Log;
import model.Calculable;
import model.ComplexNumber;
import view.View;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Presenter {
    private static final Logger log = Log.log(Presenter.class.getName());
    View view;
    Calculable model;

    public Presenter(Calculable m, View v) {
        model = m;
        view = v;
    }

    public void startProgram() {
        while (true) {
            try {
                ComplexNumber firstNumber = new ComplexNumber(view.getValue("Введите действительную часть первого числа: "),
                        view.getValue("Введите мнимую часть первого числа: "));
                log.log(Level.INFO, "Получили первое число " + firstNumber);
                String com = view.getAction("\nВведите действие: +, *, / или exit ");
                log.log(Level.INFO, "Получили действие " + com);
                if (com.equals("exit")) {
                    System.exit(0);
                }
                if (com.equals("+") || com.equals("*") || com.equals("/")) {
                    ComplexNumber secondNumber = new ComplexNumber(
                            view.getValue("\nВведите действительную часть второго числа: "),
                            view.getValue("Введите мнимую часть второго числа: "));
                    log.log(Level.INFO, "Получили второе число " + secondNumber);
                    switch (com) {
                        case "+":
                            ComplexNumber resultSum = model.sum(firstNumber, secondNumber);
                            log.log(Level.INFO, "Результат сложения " + resultSum);
                            view.printResult(resultSum, "\nРезультат: ");
                            break;
                        case "*":
                            ComplexNumber resultMultipl = model.multipl(firstNumber, secondNumber);
                            log.log(Level.INFO, "Результат умножения " + resultMultipl);
                            view.printResult(resultMultipl, "\nРезультат: ");
                            break;
                        case "/":
                            ComplexNumber resultDiv = model.division(firstNumber, secondNumber);
                            log.log(Level.INFO, "Результат деления " + resultDiv);
                            view.printResult(resultDiv, "\nРезультат: ");
                            break;
                    }
                } else throw new RuntimeException("Вы ввели недопустимое действие");
            } catch (RuntimeException e) {
                log.log(Level.INFO, e.getMessage());
                view.printMessage(e.getMessage());
            }

        }
    }
}
