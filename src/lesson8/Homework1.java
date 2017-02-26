package lesson8;


import java.util.LinkedHashSet;
import java.util.Set;

public class Homework1 {

    <T>  void  union (Set<T> set1, Set<T> set2){

        set1.addAll(set2);
    }

    <T> void intersect(Set<T> set1, Set<T> set2){
        set1.retainAll(set2);
    }

    public static void main(String[] args) {
        Homework1 hw = new Homework1();

        Set<String> set1 = new LinkedHashSet<String>();
        set1.add("whisky");
        set1.add("beer");
        set1.add("wein");

        Set<String> set2 = new LinkedHashSet<String>();
        set2.add("Vodka");
        set2.add("beer");
        set2.add("wein");

        System.out.println("First Set: " + set1);
        System.out.println("Second Set: " + set2);

        hw.union(set1, set2);

        System.out.println(set1);

        hw.intersect(set1, set2);
        System.out.println(set1);

    }

}
