public class AnimalMain {
    public static void main(String[] args) {
        Wolf w = new Wolf (1, 4, 45, "Black", "Wolf", "'Grr..'", true);
        w.voice ();
        System.out.println (w.toString ());
        System.out.println ("------------------------------------------------------------------");
        Giraffe g = new Giraffe (2, 20, 900, "Spotted orange", "Girafe", "'...'", false);
        g.voice ();
        System.out.println (g.toString ());
        System.out.println ("------------------------------------------------------------------");
        Lion l = new Lion (3, 10, 160, "Brown", "Lion", "Grrrrr..", true);
        l.voice ();
        System.out.println (l.toString ());
        System.out.println ("------------------------------------------------------------------");
        Cat c = new Cat (4, 4, 12, "Black", "Cat", "Meow", "Zefir", true);
        c.voice ();
        System.out.println (c.toString ());
        System.out.println ("------------------------------------------------------------------");
        Dog d = new Dog (5, 12, 34, "Grey", "Dog", "'Woof'", "Bobik", true);
        d.voice ();
        System.out.println (d.toString ());
        System.out.println ("------------------------------------------------------------------");
        Fish f = new Fish (6, 2, 0.1, "red", "Fisch", "'...'", false);
        f.voice ();
        System.out.println (l.toString ());
        System.out.println ("------------------------------------------------------------------");
        GuideDog gd = new GuideDog (7, 10, 28, "Brown", "Dog", "'Woof'", "Jack", true, true);
        gd.voice ();
        System.out.println (gd.toString ());
        System.out.println ("------------------------------------------------------------------");
        Crocodile cr = new Crocodile (8, 70, 650, "Green", "Crocodile", "'...'", true);
        cr.voice ();
        System.out.println (cr.toString ());
        System.out.println ("------------------------------------------------------------------");
        Hamster h = new Hamster (9, 1, 0.1, "Brown", "Hamster", "'...'", "Martin", false);
        h.voice ();
        System.out.println (h.toString ());

    }
}
