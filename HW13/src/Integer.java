import java.util.ArrayList;

public class Integer {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(15);
        for (int i = 0; i<15;i++){
            arr.add(i, (int) (Math.random() * 15));
            System.out.println(arr);

         arr.stream().average().getAsDouble();
        }
    }
}
