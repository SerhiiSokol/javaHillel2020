import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class IntegerAverage {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arr.add(i, (int) (Math.random() * 15)); }
        System.out.println(arr);
        OptionalDouble aver = arr.stream().mapToInt(s->s).average();
        double a = arr.stream().collect(Collectors.averagingInt(Integer::shortValue));
        System.out.println(aver);
        System.out.println(a);
    }
}
