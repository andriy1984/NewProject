package lesson8;

import java.util.LinkedHashSet;
import java.util.Set;

public class Homework1 {
    private static Set<String> set1;
    private static Set<String> set2;

    private void creatSet(){
        set1 = new LinkedHashSet<>();
        set1.add("whisky");
        set1.add("beer");
        set1.add("wein");

        set2 = new LinkedHashSet<>();
        set2.add("Vodka");
        set2.add("beer");
        set2.add("wein");
    }

    public static void main(String[] args) {
        MethodSet<String> hw = new MethodSet<>();

        Homework1 hw1 = new Homework1();

        System.out.println("First Set: " + set1);
        System.out.println("Second Set: " + set2);

        hw1.creatSet();
        hw.intersect(set1, set2);
        System.out.println("intersect " + set1);

        hw1.creatSet();
        hw.union(set1, set2);
        System.out.println("union " + set1);



    }

}
