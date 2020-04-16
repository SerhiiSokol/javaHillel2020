import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class CollectionTest {


    private Collection myColl = new Collection();

    @Test
    public void testAddPos() {
        myColl.add("Даша");
        assertEquals("Даша", myColl.get(0));
    }
    @Test
    public void testAddNeg() {
        myColl.add("Даша");
        assertNotEquals("Паша",myColl.get(0));
        myColl.clear();
    }
   @Test
    public void testDeletePos() {
        myColl.add("Cаша");
        myColl.add("Ваня");
        myColl.delete("Ваня");
        assertEquals((Byte) null, null);
    }

    @Test
    public void testGet() {
        myColl.clear();
        myColl.add("Aня");
        myColl.add("Василий");
        myColl.add("Евгений");
        myColl.get(0);
        assertEquals("Аня", myColl.get(0));
    }

    @Test
    public void testAddALL(){
        String [] a = {"Петя","Юра","Саша","Олег","Денис","Даша","Костя","Петя","Юра","Саша","Олег","Денис","Даша","Костя"};
       for(int i = 0;i<a.length;i++){
           myColl.add(a[i]);
       }assertEquals(myColl.size,a.length);
    }}