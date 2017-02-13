package lesson5;

import lesson5.Interfaces.Animal;

public class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("I am very happy, I have eaten meat");
    }

    @Override
    public void voice() {
        System.out.println("Hello! I am a dog!");
    }
}
