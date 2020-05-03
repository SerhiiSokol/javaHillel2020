
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbToGrafTest {


    @Test
    void numToGraf() {
        int[] arr = {2};
        String str = Arrays.toString(arr);
        char[] ch = str.toCharArray();
        assertNotNull(ch);

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();
        StringBuilder s4 = new StringBuilder();
        StringBuilder s5 = new StringBuilder();

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
                    case ('0') -> {
                        s1.append(a1);
                        s2.append(a2);
                        s3.append(a3);
                        s4.append(a4);
                        s5.append(a5);
                    }
                    case ('1') -> {
                        s1.append(b1);
                        s2.append(b2);
                        s3.append(b3);
                        s4.append(b4);
                        s5.append(b5);
                    }
                    case ('2') -> {
                        s1.append(c1);
                        s2.append(c2);
                        s3.append(c3);
                        s4.append(c4);
                        s5.append(c5);
                    }
                    case ('3') -> {
                        s1.append(d1);
                        s2.append(d2);
                        s3.append(d3);
                        s4.append(d4);
                        s5.append(d5);
                    }
                    case ('4') -> {
                        s1.append(e1);
                        s2.append(e2);
                        s3.append(e3);
                        s4.append(e4);
                        s5.append(e5);
                    }
                    case ('5') -> {
                        s1.append(f1);
                        s2.append(f2);
                        s3.append(f3);
                        s4.append(f4);
                        s5.append(f5);
                    }
                    case ('6') -> {
                        s1.append(g1);
                        s2.append(g2);
                        s3.append(g3);
                        s4.append(g4);
                        s5.append(g5);
                    }
                    case ('7') -> {
                        s1.append(h1);
                        s2.append(h2);
                        s3.append(h3);
                        s4.append(h4);
                        s5.append(h5);
                    }
                    case ('8') -> {
                        s1.append(i1);
                        s2.append(i2);
                        s3.append(i3);
                        s4.append(i4);
                        s5.append(i5);
                    }
                    case ('9') -> {
                        s1.append(j1);
                        s2.append(j2);
                        s3.append(j3);
                        s4.append(j4);
                        s5.append(j5);
                    }
                }
            }

        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        StringBuilder test = new StringBuilder();
        test.append(" @@@@  ");
        assertNotNull(s1);
        assertNotNull(s2);
        assertNotNull(s3);
        assertNotNull(s4);
        assertNotNull(s5);

    }


}