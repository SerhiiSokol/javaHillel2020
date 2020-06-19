import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList("Василий", 14, 55, "Василий", 2, 2, 10, 4, 14, 56, 66, 77));
        System.out.println("Лист с дублями: " + list);
        removeDuplicates(list);
        System.out.println("Без дублей: " + list);
    }

    public static <T> void removeDuplicates(ArrayList<T> list) {

        Set<T> set = new LinkedHashSet<>(list);

        list.clear();

        list.addAll(set);

    }
}


