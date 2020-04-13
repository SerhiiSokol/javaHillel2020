import java.util.Arrays;

public class NumToGraf {
    public static void main(String[] args) {
        int[] a = {1, 2, 7000, 5, 3, 4, 44, 67};
        numToGraf(a);
    }

    public static void numToGraf(int[] a) {
        String str = Arrays.toString(a);
        char[] ch = str.toCharArray();
        String s1, s2, s3, s4, s5;
        s1 = "";
        s2 = "";
        s3 = "";
        s4 = "";
        s5 = "";

        String a1, a2, a3, a4, a5;
        a1 = " @@@@  ";
        a2 = "@@  @@ ";
        a3 = "@@  @@ ";
        a4 = "@@  @@ ";
        a5 = " @@@@  ";
        String b1, b2, b3, b4, b5;
        b1 = "  @@   ";
        b2 = " @@@   ";
        b3 = "@ @@   ";
        b4 = "  @@   ";
        b5 = "@@@@@@ ";
        String c1, c2, c3, c4, c5;
        c1 = " @@@@  ";
        c2 = "@@  @@ ";
        c3 = "   @@  ";
        c4 = "  @@   ";
        c5 = "@@@@@@ ";
        String d1, d2, d3, d4, d5;
        d1 = " @@@@  ";
        d2 = "@@  @@ ";
        d3 = "   @@  ";
        d4 = "@@  @@ ";
        d5 = " @@@@  ";
        String e1, e2, e3, e4, e5;
        e1 = "@@  @@ ";
        e2 = "@@  @@ ";
        e3 = "@@@@@@ ";
        e4 = "    @@ ";
        e5 = "    @@ ";
        String f1, f2, f3, f4, f5;
        f1 = "@@@@@@ ";
        f2 = "@@     ";
        f3 = "@@@@@  ";
        f4 = "    @@ ";
        f5 = "@@@@@  ";
        String g1, g2, g3, g4, g5;
        g1 = " @@@@@ ";
        g2 = "@@     ";
        g3 = "@@@@@  ";
        g4 = "@@  @@ ";
        g5 = " @@@@  ";
        String h1, h2, h3, h4, h5;
        h1 = "@@@@@@ ";
        h2 = "   @@  ";
        h3 = "  @@   ";
        h4 = " @@    ";
        h5 = "@@     ";
        String i1, i2, i3, i4, i5;
        i1 = " @@@@  ";
        i2 = "@@  @@ ";
        i3 = " @@@@  ";
        i4 = "@@  @@ ";
        i5 = " @@@@  ";
        String j1, j2, j3, j4, j5;
        j1 = " @@@@@ ";
        j2 = "@@  @@ ";
        j3 = " @@@@@ ";
        j4 = "    @@ ";
        j5 = " @@@@  ";


        for (Character i : ch) {
            if (Character.isDigit(i)) {
                switch (i) {

                    case ('0'):
                        s1 += a1;
                        s2 += a2;
                        s3 += a3;
                        s4 += a4;
                        s5 += a5;

                        break;
                    case ('1'):
                        s1 += b1;
                        s2 += b2;
                        s3 += b3;
                        s4 += b4;
                        s5 += b5;
                        break;
                    case ('2'):
                        s1 += c1;
                        s2 += c2;
                        s3 += c3;
                        s4 += c4;
                        s5 += c5;
                        break;
                    case ('3'):
                        s1 += d1;
                        s2 += d2;
                        s3 += d3;
                        s4 += d4;
                        s5 += d5;
                        break;
                    case ('4'):
                        s1 += e1;
                        s2 += e2;
                        s3 += e3;
                        s4 += e4;
                        s5 += e5;
                        break;
                    case ('5'):
                        s1 += f1;
                        s2 += f2;
                        s3 += f3;
                        s4 += f4;
                        s5 += f5;
                        break;
                    case ('6'):
                        s1 += g1;
                        s2 += g2;
                        s3 += g3;
                        s4 += g4;
                        s5 += g5;
                        break;
                    case ('7'):
                        s1 += h1;
                        s2 += h2;
                        s3 += h3;
                        s4 += h4;
                        s5 += h5;
                        break;
                    case ('8'):
                        s1 += i1;
                        s2 += i2;
                        s3 += i3;
                        s4 += i4;
                        s5 += i5;
                        break;
                    case ('9'):
                        s1 += j1;
                        s2 += j2;
                        s3 += j3;
                        s4 += j4;
                        s5 += j5;
                        break;
                }
            }

        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }


}






