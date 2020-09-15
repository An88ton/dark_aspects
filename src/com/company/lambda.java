package com.company;

/**
 * Локальные переменные изменять нельзя в лямбдах
 * Лямбда это тоже, что и анонимный клас, но короче, и економнее к памяти
 */
public class lambda {
    static int b = 10;
    interface Operationable{
        public int sum(int a);
    }
    public static void main(String[] args) {
        Operationable s = (a)->{
            b=20;
            return a*5;
        };

        System.out.println(s.sum(8));
        System.out.println(b);
    }
}
