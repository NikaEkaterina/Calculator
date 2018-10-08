package com.example.HelloWorld;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите номер задания. 1 - Calculator; 2 - String array ");
        Scanner t = new Scanner(System.in);
        int task = t.nextInt();
        if (task==1){
            Scanner Calculator = new Scanner(System.in);

            double fn; // Создана переменная fn

            double sn; // Создана переменная sn
            String operator; // оператор
            System.out.println("Введите 1-е число");
            fn = Calculator.nextDouble();
            System.out.println("Введите одну из операций (+,-,*,/)");
            operator = Calculator.next();
            System.out.println("Введите 2-е число");
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
        if (task==2){
            System.out.println("Введите длинну массива");
            Scanner n = new Scanner(System.in);
            int a = n.nextInt();
            String[] str = new String[a];
            int[] L = new int[a];

            System.out.println("Мведите буквенные значения массива");
            Scanner r = new Scanner(System.in);
            int max_w = 0;

            for (int i = 0; i < str.length; i++) {
                str[i] = r.nextLine();
                L[i] = str[i].length();
                if (max_w < L[i]) {
                    max_w = L[i];

                }
            }
            int maxIndex = 0;
            for (int i = 0; i < L.length; i++) {

                if (max_w == L[i]) {
                    maxIndex=i;
                }
            }
            System.out.println(" Массив слов: " + Arrays.toString(str));
            System.out.println(" Индекс самого длинного слова (началтный индекс равен 0): " +maxIndex);

        }
    }
}
