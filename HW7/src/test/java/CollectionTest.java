import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CollectionTest {

    @Test
    public void testAddPos() throws Exception {
        Collection test = new Collection();
        test.add("1");
        assertEquals("1", test.get(test.getSize() - 1));
    }

    @Test
    public void testAddNeg() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        assertNotEquals("H1", test.get(test.getSize() ));
    }

    @Test
    public void testDeletePos() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.delete("Hi");
        assertEquals("How're you?", test.get(0));
    }

    @Test
    public void testDeleteNeg() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.delete("Hi");
        assertNotEquals("Hi", test.get(0));
    }

    @Test
    public void testGetPos() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals("How're you?", test.get(1));
    }

    @Test
    public void testGetNeg() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals("Hi", test.get(1));
    }

    @Test
    public void testEqualsPos() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        String[] str = new String[] {"Hi", "How're you?"};
        assertEquals(true, test.equals(str));
    }

    @Test
    public void testEqualsNeg() throws Exception {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        String[] str = new String[] {"H1", "How're you?"};
        assertNotEquals(true, test.equals(str));
    }

    @Test
    public void testClearPos() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        test.clear();
        assertEquals(0, test.getSize());
    }

    @Test
    public void testClearNeg() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        test.clear();
        assertNotEquals(1, test.getSize());
    }

    @Test
    public void testFindPos() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals(1, test.find("How're you?"));
    }

    @Test
    public void testFindNeg() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals(0, test.find("How're you?"));
    }

    @Test
    public void testGetSizePos() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals(3, test.getSize());
    }

    @Test
    public void testGetSizeNeg() {
        Collection test = new Collection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals(2, test.getSize());
    }
}