import java.util.Scanner;

/**
 * Lesson 2 GB
 * Ввод команд через консоль. Калькулятор
 *
 * @author Vladislav Akolzin
 * @version dated: 05.07.2021
 */


public class Calculator {
    public static void main(String[]  args){
        System.out.println("Введите операцию");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b  = scanner.nextInt();
        int result;
        if (operation == 1){
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3){
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Результат = " + result);
    }
}