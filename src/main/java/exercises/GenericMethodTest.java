package exercises;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    static <T> void  fromArrayToCollection(T[] a, Collection<T> c){
        for (T o : a){
            System.out.println(o);
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] objects = new Object[100];
        ArrayList<Object> oc = new ArrayList<>();
        fromArrayToCollection(objects,oc);

    }
}
