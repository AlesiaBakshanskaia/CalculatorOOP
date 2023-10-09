package view;

import model.ComplexNumber;

import java.util.Scanner;

public class View {

    public float getValue(String message) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s", message);
        try {
            return in.nextFloat();
        } catch(Exception e) {
            throw new RuntimeException("Вы ввели неверный формат числа");
        }

    }
    public String getAction(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void printResult(ComplexNumber number, String message) {
        System.out.printf("%s %s\n", message, number);
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
