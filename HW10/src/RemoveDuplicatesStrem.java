import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicatesStrem {
    public static void main(String[] args) {
        var list = new ArrayList<>(Arrays.asList(3, 14, 55, 55, 2, 2, 10, 4, 14, 56, 66, 77));
        System.out.println("Лист с дублями: " + list);
        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        System.out.println("Без дублей: " + list);
    }
}
