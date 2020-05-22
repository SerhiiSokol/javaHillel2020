import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("one", "two", "three", "four", "five", "six");
        List<Pair<String, String>> res = pair(str);

        System.out.println(str.toString().replace("[", "").replace("]", ""));
        System.out.println(res.toString().replace("[", "").replace("]", ""));
    }

    public static List<Pair<String, String>> pair(List<String> str) {
        return str.stream().map(i -> new Pair<>(i, i.toUpperCase())).collect(Collectors.toList());
    }
}

