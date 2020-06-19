import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("one", "two", "three", "four", "five", "six");
        System.out.println(str.toString().replace("[", "").replace("]", ""));
        pair(str);
    }

    public static void pair(List<String> str) {
        List<Pair<String, String>> res = str.stream().map(i -> new Pair<>(i, i.toUpperCase())).collect(Collectors.toList());
        System.out.println(res.toString().replace("[", "").replace("]", ""));
    }
}

