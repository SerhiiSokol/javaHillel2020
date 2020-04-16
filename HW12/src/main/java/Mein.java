public class Mein {
    public static void main(String[] args) {
        Collection friends = new Collection ();
        friends.add ("Вася");
        friends.add ("Петя");
        friends.add ("Юра");
        friends.add ("Саша");
        friends.add ("Олег");
        friends.add ("Денис");
        friends.add ("Даша");
        friends.add ("Костя");

        friends.delete (friends.find ("Вася"));
        friends.delete("Юра");
        System.out.println ("Все элементы массива: ");
        for (int i = 0; i < friends.getSize (); i++) {
            System.out.println (friends.get (i));
        }
        System.out.println ();
        System.out.println (friends.contains("Юр"));
        String[] SomeArray = new String[] {"Вася", "Саша"};
        System.out.println ("Массивы эквиваленты? - "+friends.equals (SomeArray));
        System.out.println ("Индекс искомого элемента массива "+friends.find ("Даша"));
        System.out.println ("Длина массива "+friends.getSize ());
        System.out.println ();
        System.out.println ("Очистим наш массив");
        friends.clear ();
        System.out.println ("Длина массива "+friends.getSize ());

    }
}
