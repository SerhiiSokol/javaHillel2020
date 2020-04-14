import java.util.Collection;
public class ThreadOfList implements CustomCollection {
    public Node first = null;
    private Node last = null;
    int size = 0;

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        return size;
    }

    public boolean add(String str) {
        Node newNode = new Node(str);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
        return true;
    }

    public boolean addAll(String[] strArr) {
        for (String str : strArr) {
            add(str);
        }
        return true;
    }

    public boolean addAll(Collection strColl) {
        for (Object str : strColl) {
            add((String) str);
        }
        return true;
    }

    public boolean delete(int index) {
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return false;
        }
        delete(get(index));
        return true;
    }

    public boolean delete(String str) {
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return false;
        } else {
            Node cur = first;
            Node prev = first;
            while (!cur.data.equals(str)) {
                prev = cur;
                cur = cur.next;
            }
            if (cur == first) {
                first = first.next;
            } else
                prev.next = cur.next;

        }
        size--;
        return true;
    }

    public String get(int index) {
        if (isEmpty()) {
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
        if (coll.size() != size()) return false;
        else {
            for (Object lines : coll) {
                if (!current.data.equals(lines)) return false;
                current = current.next;
            }
            return true;
        }

    }

    public boolean contains(String str) {
        Node cur = first;
        if (isEmpty()) {
            System.out.println("Список пуст!");
            return false;
        } else {
            while (!cur.data.equals(str)) {
                cur = cur.next;
                if (cur.next == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean trim() {
        return true;
    }

    public boolean clear() {
        first = null;
        size = 0;
        return true;
    }

    public void showMe() {
        if (isEmpty()) {
            System.out.print("Пуст!");
        } else {
            Node cur = first;
            while (cur != null) {
                System.out.print(cur.data + "; ");

                cur = cur.next;
            }
        }
        System.out.println();
    }


}




