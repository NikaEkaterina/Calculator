

package com.example.HelloWorld;
import java.util.Scanner;

public class Calculator {
    /**
     * @author Ника Екатерина
     */
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);
        double fn; // Создана переменная fn
        double sn; // Создана переменная sn
        String operator; // оператор

        fn = Calculator.nextDouble();
        operator = Calculator.next();
        sn = Calculator.nextDouble();

        if (operator.equals("*")){
            System.out.printf("%.4f", (fn * sn)); // Форматирование чисел с плавающей точкой
        }
        if (operator.equals("/")) {
            System.out.printf("%.4f", (fn / sn)); // Форматирование чисел с плавающей точкой
        }
        if (operator.equals("+")) {
            System.out.printf("%.4f", (fn + sn)); // Форматирование чисел с плавающей точкой
        }
        if (operator.equals("-")) {
            System.out.printf("%.4f", (fn - sn)); // Форматирование чисел с плавающей точкой

        }
    }
}


