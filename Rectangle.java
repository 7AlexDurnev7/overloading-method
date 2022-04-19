package com.company;

import java.util.Scanner;

// класс прямоугольника
public class Rectangle {

        private String name; //имя
        private double a; //сторона а
        private double b; //сторона б

    //методы

    //конструкторы

    // 1. Конструтор с ТРЕМЯ параметрами
    public Rectangle ( String name, double a, double b) {
        //инициализация полей класса
        this.name = name;
        this.a = a;
        this.b = b;
    }

    // 2. Конструтор с ДВУМЯ параметрами
    public Rectangle ( String name, double a) {
        this.name = name;
        this.a = a;
    }

    // 2. Конструтор по умолчанию- без параметров
    public Rectangle () {
        this.name = "Degenerate";
        this.a = 0;
        this.b = 0;
    }

    //Getters
    String getName() {
        return name;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    //Setters
    void setA (double a){
        this.a = a ;
    }

    void setB (double b){
        this.a = b ;
    }

    //Метод вывода прямоугольника
    public void consolePrint () {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name +  ": " + a +  " X " + b;
    }

    //метод ввода
    public void consoleInput (Scanner in ){
        System.out.println("Введите имя прямоугольника: ");
        name = in.nextLine();
        System.out.println("Введите сторону А");
        a = in.nextDouble();
        System.out.println("Введите сторону А");
        b = in.nextDouble();
        System.out.println("Введите сторону B");
    }

    //Площадь и Периметр
    public double P () {
        return (a + b) * 2;
    }
    public double S () {
        return a * b;
    }
    //метод сравнения прямоугольников по площади
    public int compare(Rectangle rect) {
        double s1 = S(), s2 = rect.S();
        if (s1 == s2)
            return 0;
        if (s1 > s2)
            return 1;
            return -1;
    }
}
