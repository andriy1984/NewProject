package lesson5.person;

public class Student extends Person {

    TYPE_PERSON student;

    public Student(String name){
        this.name = name;
        student = TYPE_PERSON.STUDENT;
    }

    @Override
    public void print() {
        System.out.println("I am a " + student + " name is " + name);
    }
}
