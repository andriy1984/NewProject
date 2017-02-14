package lesson5;

import lesson5.Interfaces.Animal;

public class CatDog {
    public static void main(String[] args) {
        Animal [] aray = {
                new Cat(),
                new Dog(),
                new Cat()
        };
        for (Animal h:aray
             ) {
            h.feed();
            h.voice();
        }
    }
}
