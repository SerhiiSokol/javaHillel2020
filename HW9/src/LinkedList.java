import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements CustomCollection {
    public Node first = null;
    private Node last = null;

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        Node current = first;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean add(String str) {
        Node newNode = new Node (str);
        if (isEmpty ()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
            return true;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            return true;
        }
    }

    public boolean addAll(String[] strArr) {
        for (String newString : strArr) {
            add (newString);
        }
        return true;
    }

    public boolean addAll(Collection strColl) {
        for (Object str : strColl) {
            Node newNode = new Node ((String) str);
            if (isEmpty ()) first = newNode;
            else last.next = newNode;
            last = newNode;
        }
        return true;
    }

    public boolean delete(int index) {
        if (isEmpty ()) {
            System.out.println ("Список пуст!");
            return false;
        }
        delete (get (index));
        return true;
    }

    public boolean delete(String str) {
        if (isEmpty ()) {
            System.out.println ("Список пуст!");
            return false;
        } else {
            Node cur = first;
            Node prev = first;
            while (!cur.data.equals (str)) {
                prev = cur;
                cur = cur.next;
            }
            if (cur == first)
                first = first.next;
            else
                prev.next = cur.next;
        }
        return true;
    }

    public String get(int index) {
        if (isEmpty ()) {
            return "Список пуст!";
        }
        int runner = 0;
        Node cur = first;
        while (runner != index) {
            cur = cur.next;
            runner++;
        }
        return cur.data;
    }

    public boolean compare(Collection coll) {
        Node current = first;
        if (coll.size () != size ()) return false;
        else {
            for (Iterator iterator = coll.iterator (); iterator.hasNext (); ) {
                Object lines = iterator.next ();
                if (!current.data.equals (lines)) return false;
                current = current.next;
            }
            return true;
        }

    }

    public boolean contains(String str) {
        Node cur = first;
        if (isEmpty ()) {
            System.out.println ("Список пуст!");
            return false;
        } else {
            while (!cur.data.equals (str)) {
                cur = cur.next;
                if (cur.next == null) {
                    System.out.println ("not found");
                    return false;
                }
            }
        }
        System.out.println ("found!");
        return true;
    }

    public boolean trim() {
        return true;
    }

    public boolean clear() {
        first = null;
        return true;
    }

    public void showMe() {
        if (isEmpty ()) {
            System.out.println ("пуст!");
        } else {
            Node that = first;
            System.out.println ("Первый элемент: " + first.data);
            while (that != null) {
                System.out.println (that.data);
                that = that.next;
            }
            System.out.println ("Last элемент: " + last.data);
        }
    }


}




