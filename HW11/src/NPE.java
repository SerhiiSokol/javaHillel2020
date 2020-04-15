import java.util.HashMap;
import java.util.Map;

public class NPE {
    public static void main(String args[]) {
        Map map = new HashMap<>();
        int[] ar = {1, 2, 4};
        for (int i : ar) {
            int count = (int) map.get(i);
            map.put(i, count++);
        }
    }
}