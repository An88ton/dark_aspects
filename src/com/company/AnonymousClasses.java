package com.company;

/**
 * Анонимный класс имеет доступ к полям внешнего класса.
 *
 * Анонимный класс не имеет доступ локальным переменным области, в которой он определен,
 * если они не финальные (final) или неизменяемые (effectively final).
 *
 * Как и у других внутренних классов, объявление переменной с именем, которое уже занято, затеняет предыдущее объявление.
 * Анонимные классы имеют те же ограничения, что и локальные:
 *  Вы не можете определять статические члены анонимного класса.
 *  Анонимный класс может содержать статические поля, если это константы.
 *  Анонимные классы также могут содержать в себе локальные классы. Конструктора в анонимном классе быть не может.
 */

public class AnonymousClasses {
    private interface Helloable { //Интерфейсы всегда статичны
        String hi();
    }
    public static void sayHello(){
        Helloable anonymousHello = new Helloable() {
            private String secretHello = "Masons alive";
            @Override
            public String hi() {
                return secretHello;
            }
        };
        System.out.println(anonymousHello.hi());
    }

    public static void main(String[] args) {
        AnonymousClasses.sayHello();
    }

}
