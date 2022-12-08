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
