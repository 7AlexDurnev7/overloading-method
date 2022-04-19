package com.company;

import java.util.Scanner;

public class runRectangle {
    /*
    //ЗАДАЧА:
    //написать класс "Прямоугольника"
    // реализовать методы:
    // - получение периметра и площади прямоугольника
    // - вывод прямоугольника в консоль
    // - ввода прямоуголника с клавиатуры
    */

    /*
    ЗАДАЧА
//    создать массив прямоуголников (рандомных)
//    в этом массиве найти наибольший прямоугольник
//    вывести его на экран
     */


    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.consoleInput(new Scanner(System.in));
        r.consolePrint();
        System.out.println("Square = " + r.S());
        System.out.println("Perimeter = " + r.P());
        System.out.println("Name = " + r.getName());


        //1 создание массива объекта (ссылок на объекты)
        final int N = 10;
       Rectangle [] rectangles = new Rectangle[N];

       //2 инициализация самих объектов
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle ("R1" + i, (int)(Math.random() * 10),
                    (int)(Math.random() * 10));
        }

        //3 вывод объектов используем for each
        System.out.println("Rectangles ");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
        // 4. поиск максимального
        Rectangle maxRect = rectangles[0];
        int maxIndex = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].compare(maxRect) > 0) {
                maxRect = rectangles[i];
                maxIndex = i;
            }
        }
        System.out.println("Max: " + maxRect);
        System.out.println("Index: = " + maxIndex);
        }
    }

