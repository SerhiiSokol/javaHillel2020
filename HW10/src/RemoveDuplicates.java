import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<> (Arrays.asList (2, 14, 55, 55, 2, 2, 10, 4, 14, 56, 66, 77));
        System.out.println ("Лист с дублями: " + list);
        System.out.println ("Значение под индексом 5: "+list.get (5));

        removeDuplicates (list);

        System.out.println ("Без дублей: " + list);
        System.out.println ("Новое значение под индексом 5: "+list.get (5));
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        Set<T> set = new LinkedHashSet<> ();

        set.addAll (list);

        list.clear ();

        list.addAll (set);

        return list;
    }
}


