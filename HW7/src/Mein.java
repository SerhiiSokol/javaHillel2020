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
        for (int i = 0; i < friends.getSize (); i++) {
            System.out.println (friends.get (i));
        }
        System.out.println ();
        System.out.println (friends.find ("Даша"));

    }
}
