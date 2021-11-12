package com.geekbrains;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1. Проверка, входит ли сумма чисел в диапазон от 10 до 20 включительно. Введите целое число!");
        int input1 = scanner.nextInt();
        System.out.println("Введите еще одно целое число!");
        int input2 = scanner.nextInt();
        boolean is10to20 = sumTenToTwenty(input1, input2);
        if(is10to20) {
            System.out.println("Сумма этих чисел равна " + (input1 + input2) + ", что входит в заявленный диапазон.");
        } else {
            System.out.println("Сумма этих чисел равна " + (input1 + input2) + ", что не входит в заявленный диапазон.");
        }
        System.out.println("Задание 2. Проверка числа на знак. Введите положительное или отрицательное целое число!");
        int input3 = scanner.nextInt();
        plusOrMinus(input3);

        System.out.println("Задание 3. Другая проверка числа на знак. Введите положительное или отрицательное целое число!");
        int input4 = scanner.nextInt();
        boolean isPositive = positiveOrNegative(input4);
        if(isPositive){
            System.out.println("Это число положительное либо равно нулю.");
        }else{
            System.out.println("Это число отрицательное.");
        }

        System.out.println("Задание 4. Напечатаю вашу строку любое выбранное число раз. Введите любую надпись!");
        String inputString = scanner.next();
        System.out.println("Введите, сколько раз это напечатать (целое число).");
        int inputStringCount = scanner.nextInt();
        stringTyping(inputString, inputStringCount);

        System.out.println("Задание 5. Введите год, а я определю, високосный он или нет.");
        int inputYear = scanner.nextInt();
        boolean isLeap = leapYear(inputYear);
        if(isLeap) {
            System.out.println("Этот год високосный.");
        }else {
            System.out.println("Этот год невисокосный.");
        }
    }

    private static boolean sumTenToTwenty(int a, int b){
        int sum = a+b;
        return sum >= 10 && sum <= 20;
    }
    private static void plusOrMinus(int c){
        if(c>=0){
            System.out.println("Это число положительное либо равно нулю.");
        }else{
            System.out.println("Это число отрицательное.");
        }
    }
    private static boolean positiveOrNegative(int d){
        return  d>= 0;
    }
    private static void stringTyping(String userString, int userStringCount){
        for (int i=1; i <= userStringCount; i++){
            System.out.println(i + ". " + userString);
        }
    }
    private static boolean leapYear(int userYear){
        if(userYear % 4 == 0){
            return userYear % 100 != 0 || userYear % 400 == 0;
        }else {
            return false;
        }
    }

}
