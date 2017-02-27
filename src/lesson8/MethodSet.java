package lesson8;


import java.util.Set;

public class MethodSet<T> {

   void  union (Set<T> set1, Set<T> set2){

        set1.addAll(set2);
    }

    void intersect(Set<T> set1, Set<T> set2){
        set1.retainAll(set2);
    }
}
