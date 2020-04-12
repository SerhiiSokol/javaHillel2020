import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        List strCll = new ArrayList ();
        String[] strArr = {"1","2","Ivan","3"};

        strCll.add ("Вася");
        strCll.add ("Петя");
        strCll.add ("Юра");
        strCll.add ("Саша");
        strCll.add ("Олег");
        strCll.add ("Денис");
        strCll.add ("Даша");
        strCll.add ("Костя");
        list.add("petya");
        list.add("2");
        list.add("Vasya");
        list.add("4");
        list.add("5");
        list.addAll (strCll);
        list.addAll (strArr);

       list.delete ("2");
       list.delete (2);

    System.out.println ("Мой связанный список: ");
        list.showMe();
        System.out.println ("_____________");
        System.out.println ("Элемент по искомому индексу: "+list.get (2)+" !");
        System.out.println ("_____________________________");
        System.out.println (list.size ());
        System.out.println ("________");
        System.out.println (list.contains ("Lida"));
        System.out.println ("________");
        System.out.println ((list.compare (strCll)));
        System.out.println (list.trim ());
        list.clear ();
    }
}
