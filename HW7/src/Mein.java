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
        for (int i = 0; i < friends.getSize (); i++) {
            System.out.println (friends.get (i));
        }
        System.out.println ();
        String[] SomeArray = new String[] {"Вася", "Саша"};
        System.out.println (friends.equals (SomeArray));
        System.out.println (friends.find ("Даша"));

    }
}
