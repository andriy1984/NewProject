package lesson5.person;

public class PersonMain {

    public static void main(String[] args) {
        Person [] per = {
                new Student("Petro"),
                new Cleaner("Maria"),
                new Teacher("Paraska"),
                new Student("Mykola"),
                new Student("Andrii")
        };

        for (Person p:per) {
            if (p instanceof Staff){
                p.print();
                ((Staff) p).salary();
            }else{
                p.print();
            }
        }
    }
}
