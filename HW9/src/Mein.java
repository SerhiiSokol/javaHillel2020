import java.util.LinkedList;
import java.util.List;

public class Mein {
    public static void main(String[] args) {
        LinkedArray array = new LinkedArray();
        List<String> list = new LinkedList<>();
        String[] stringArray = new String[3];

        System.out.println("---------------------array---------------------");
        array.add("My name is Daria");
        array.add("This day is great");
        array.add("I truly want you to be happy!");
        array.add("!");
        array.add("!");
        array.add("Selena");
        array.add("Madonna");
        array.add("Saoirse");
        array.displayList();
        System.out.println(array.size());
        System.out.println("-------------------------------------------");

        System.out.println("---------------------line---------------------");
        list.add("My name is Daria");
        list.add("This day is great");
        list.add("I truly want you to be happy!");
        list.add("!");
        list.add("!");
        list.add("Selena");
        list.add("Madonna");
        list.add("Saoirse");
        for(String lines : list){
            System.out.println(lines);
        }
        System.out.println(list.size());
        System.out.println("-------------------------------------------");

        System.out.println(array.compare(list));

        stringArray[0] = "Lindsey";
        stringArray[1] = "Emma";
        stringArray[2] = "Elizabeth";

        array.addAll(stringArray);
        array.displayList();
        System.out.println(array.size());

        array.addAll(list);
        array.displayList();
        System.out.println(array.size());

        array.delete(6);
        array.displayList();
        System.out.println(array.size());

        array.delete("Madonna");
        array.displayList();
        System.out.println(array.size());

        array.clear();
        array.displayList();
        System.out.println(array.size());

    }
}
