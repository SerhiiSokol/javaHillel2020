import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {
    Collection test = new Collection();

    @org.junit.jupiter.api.Test
    void add() {
        test.add(null);
        test.add("Вася");
        assertNull(test.get(0));
        assertEquals(test.get(1), "Вася");
    }

    @org.junit.jupiter.api.Test
    void delete() {
        test.delete("Вася");
        test.delete(0);
        assertEquals(test.get(0), "Элемент не найден");
        assertEquals(test.get(1), "Элемент не найден");
    }

    @org.junit.jupiter.api.Test
    void getSize() {
        test.add("TEST");
        test.add("TEST1");
        test.add("TEST2");
        test.delete(2);
        test.add("TEST3");
        assertEquals(test.getSize(), 3);
    }

    @org.junit.jupiter.api.Test
    void get() {
        test.add("TEST");
        test.add("TEST1");
        test.add("TEST2");
        assertEquals(test.get(0), "TEST");
    }

    @org.junit.jupiter.api.Test
    void clear() {
        test.add("TEST");
        test.add("TEST1");
        test.add("TEST2");
        test.clear();
        assertEquals(test.getSize(), 0);

    }

    @org.junit.jupiter.api.Test
    void contains() {
        test.add("TEST");
        test.add("TEST1");
        test.add("TEST2");
        assertEquals(test.contains("TEST"), "Элемент есть в массиве под интексом " + 0);
        assertEquals(test.contains("tEST"), "Такого элемента нет");
    }

    @org.junit.jupiter.api.Test
    void find() {
        test.add("TEST");
        test.add("TEST1");
        test.add("TEST2");
        assertEquals(test.find("TEST2"), 2);
        assertEquals(test.find("TEST3"), -1);
    }
}