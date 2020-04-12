import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ThreadOfList list = new ThreadOfList ();

        list.add ("Женя");
        list.add ("Коля");
        list.add ("Ира");
        list.add ("Ольга");
        list.add ("Никита");
        System.out.println ("Текущий список : ");
        list.showMe ();
        System.out.println ("Список состоит из: "+list.size ()+" елемента(ов).");
        System.out.println ("______________________________________________________");

        String[] strArr = {"Дмитрий", "Алексей", "Иван", "Инна"};
        list.addAll (strArr);
        System.out.println ("Текущий список : ");
        list.showMe ();
        System.out.println ("Список состоит из: "+list.size ()+" елемента(ов).");
        System.out.println ("______________________________________________________");

        ArrayList strCll = new ArrayList ();
        strCll.add ("Вася");
        strCll.add ("Петя");
        strCll.add ("Юра");
        strCll.add ("Саша");
        strCll.add ("Олег");
        strCll.add ("Денис");
        strCll.add ("Даша");
        strCll.add ("Костя");
        list.addAll (strCll);
        System.out.println ("Текущий список : ");
        list.showMe ();
        System.out.println ("Список состоит из: "+list.size ()+" елемента(ов).");
        System.out.println ("______________________________________________________");

        list.delete (4);
        list.delete ("Женя");
        System.out.println ("Текущий список : ");
        list.showMe ();
        System.out.println ("Список состоит из: "+list.size ()+" елемента(ов).");
        System.out.println ("______________________________________________________");

        System.out.println ("Элемент по искомому индексу: " + list.get (2) + " !");
        System.out.println ("______________________________________________________");
        System.out.println ("Список сожержит элемент? - "+list.contains ("Вася"));
        System.out.println ("______________________________________________________");
        System.out.println ("Список эквивалентен заданной колекции? - "+(list.compare (strCll)));
        System.out.println ("______________________________________________________");
        System.out.println ("Трим - "+list.trim ());

        list.clear ();
        System.out.println ("Текущий список : ");
        list.showMe ();
    }
}
