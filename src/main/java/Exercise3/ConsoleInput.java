package Exercise3;

import java.util.Scanner;

public class ConsoleInput {

    public void input() {
        float firstNumber;
        String operator;
        float secondNumber;
        float result = 0;
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine().replace(',', '.');


        firstNumber = Float.parseFloat(in);

        System.out.println("Введите оператор: ");
        in = scanner.nextLine();
        operator = in;

        System.out.println("Введите второе число: ");
        in = scanner.nextLine().replace(',', '.');
        secondNumber = Float.parseFloat(in);

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("неизвестный оператор");

        }
        System.out.printf("%.4f", result);
        System.out.println("\n");


    }
}
