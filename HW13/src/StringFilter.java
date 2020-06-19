import java.util.Arrays;
import java.util.List;


public class StringFilter {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ja", "java", "Jav", "JAVA", "jaVa", "hille", "j","five");
        filter(str);
    }
        static void filter(List<String> str){
         str.stream().filter(s -> s.length() == 4 && s.equals(s.toLowerCase())).forEach(System.out::println);
    }
}

