package com.company;
/**
 * При переопределении методов нельзя изменять тип возвращаемого значения, модификатор доступа можно изменять ТОЛЬКО
 * на более широкий, изменение Exception возмножно, НО только как специализация(если в методе родителя стоит более
 * широкий тип ошибки то в методе потомка можно заменить на более узкий(Exception -> IOException), но не наоборот).
 * При изменении количества или типа параметров происходит уже перегрузка, в ней можно изменять и тип доступа
 * и тип возвращаемого значения.
 */


import java.io.IOException;

class A{

    public void method() throws Exception{
        System.out.println("A");
    }
    public String method(String a){
        System.out.println("A String");
        return "";
    }
}

class B extends A{
    @Override
    public void method() throws IOException {
        System.out.println("B");
    }
}

public class OverrideOverload {

    public static void main(String[] args) {
	    B a = new B();
        try {
            a.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
