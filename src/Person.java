import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {

    private String name;
    private int birthYear;

    public Person(){
    }

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getAge(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int age = Integer.parseInt(dateFormat.format(new Date())) - birthYear;
        return age;
    }

    public void changeName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person: " + name + " age: " + this.getAge();

    }

    public static void main(String[] args) {
        Person ps1 = new Person("Panas ", 1925);
        System.out.println(ps1);
        Person ps2 = new Person();
        ps2.setName("Petro");
        ps2.setBirthYear(1944);
        System.out.println(ps2);
        Person ps3 = new Person("Maryna", 1990);
        System.out.println(ps3);

    }

}
