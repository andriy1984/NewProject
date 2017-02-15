package lesson5.person;

abstract public class Person {

    protected enum TYPE_PERSON{
        TEACHER, CLEANER, STUDENT
    }

    protected String name;

    protected abstract void print();


}
