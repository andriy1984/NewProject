package lesson5.person;


public class Teacher extends Staff{

    TYPE_PERSON teacher;

    public Teacher(String name){
        teacher = TYPE_PERSON.TEACHER;
        this.name = name;
    }

    @Override
    public void salary() {
        System.out.println("Salary 6000");
    }

    @Override
    public void print() {
        System.out.println("I am a " + teacher + " name is " + name);
    }
}
