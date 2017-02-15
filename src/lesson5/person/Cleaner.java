package lesson5.person;

public class Cleaner extends Staff{

    TYPE_PERSON cleaner;

    public Cleaner(String name){
        cleaner = TYPE_PERSON.CLEANER;
        this.name = name;
    }

    @Override
    public void salary() {
        System.out.println("Salary 6000");
    }

    @Override
    public void print() {
        System.out.println("I am a " + cleaner + " name is " + name);
    }
}
