public class Collection {
    private String[] myArray = new String[10];
    private int size = 0;


    public void add(String s) {
        myArray[size] = s;
        size++;
        if (size == myArray.length) {
            String[] newArray = new String[myArray.length * 2];
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            size--;
        }
    }

    public void delete(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals (myArray[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            delete (index);
        }

    }

    public int getSize() {
        return size;
    }

    public String get(int index) {

        if (index >= 0 && index < size) {
            return myArray[index];
        } else {
            return "Элемент не найден";
        }
    }

    public void clear() {
        myArray = new String[10];
        size = 0;
    }

    public String indexOf(String s) {       //в String
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals (myArray[i])) {
                indexOf = i;
                break;
            }
        }
        if (indexOf >= 0) {
            return "Индекс искомого элемента " + indexOf;
        } else {
            return "Такого элемента нет";
        }
    }

    public int find(String s) {             //в int
        int indexOf = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals (myArray[i])) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }
}