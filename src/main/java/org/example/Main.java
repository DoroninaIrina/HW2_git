package org.example;

public class Main {
    public static void main(String[] args) {

        //Переполнение
        byte a, b, c;
        a = 120;
        b = a + 8;
        c = 1000;

        short a1, b1, c1;
        a1 = 32767;
        b1 = 65535;
        c1 = a1 - b1;

        int a2, b2, c2;
        a2 = -2147483648;
        b2 = -2;
        c2 = a2 - 1;

        System.out.println(b);
        System.out.println(a - b);
        System.out.println(c / b);
        System.out.println(a + a);

        System.out.println(c1);
        System.out.println(a1 + b1);

        System.out.println(c2);
        System.out.println(a2 - b2);
        System.out.println(c2 + b2);

        //Вычисление комбинаций int и double

        int k = 7;
        int s = k + l;
        double l = 0.3D;
        double m = -0.7D;


        System.out.println(k / l);
        System.out.println(k / m);
        System.out.println(k + m);
        System.out.println(k * (l + m));
    }
}

    //Типы данных
    //целые числа
    byte varByte = 1;   //занимает 1 байт,  -128...127, -2^7..(2^7)-1
    short varShort = 1; //занимает 2 байта, -32768...32767, -2^15..(2^15)-1
    int varInt = 1;     //занимает 4 байта, -2147483648...2147483647, 2^31..(2^31)-1
    long varLong = 1;   //занимает 8 байт,  -9223372036854775808...9223372036854775807, 2^63..(2^63)-1

    //числа с плавающей точкой
    float varFloat = 0.0f;   //занимает 4 байта, -3.4*10^38...3.4*10^38
    double varDouble = o.od; //занимает 8 байт,  --1.7*10^308 до +1.7*10^308

    //логический
    boolean varBool = true;

    //Символьный
    char varChar = 'c';

    //Операторы
    //1. Операторы присвоения
    int varInt0 = 0;
        varInt0 += 10;
                varInt0 = varInt0 + 10

                //2. Математические + - / * %
                varInt = 7 / 4;
                varInt = 7 % 4; //взятие остатка от деления
                varInt = ++varInt; //прибавит единичку и вернёт результат
                varInt = varInt++; //прибавит вернёт результат и вернёт единичку

                3. Сравнения <, >, >=, <=, !=, ==

        4. Логические операторы
        && и
        || или
        ! не (меняет true на false)
