public class Collection{
    public String[] myArray = new String[10];



    public int size = 0;

    public void add(String s) {
        myArray[size] = s;
        size++;
        if (size == myArray.length) {
            String[] newArray = new String[myArray.length * 2];
            System.arraycopy(myArray, 0, newArray, 0, myArray.length);
            myArray = newArray;
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < getSize ()) {
            if (getSize() - 1 - index >= 0) System.arraycopy(myArray, index + 1, myArray, index, getSize() - 1 - index);
            size--;
        }
    }

    public void delete(String s) {
        int index = -1;
        for (int i = 0; i < getSize (); i++) {
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

        if (index >= 0 && index < getSize ()) {
            return myArray[index];
        } else {
            return "Элемент не найден";
        }
    }

    public void clear() {
        myArray = new String[10];
        size = 0;
    }

    public String contains(String s) {
        int cont = -1;
        for (int i = 0; i < getSize (); i++) {
            if (s.equals (myArray[i])) {
                cont = i;
                break;
            }
        }
        if (cont >= 0) {
            return "Элемент есть в массиве под интексом " + cont;
        } else {
            return "Такого элемента нет";
        }
    }

    public int find(String s) {
        int indexOf = -1;
        for (int i = 0; i < getSize (); i++) {
            if (s.equals (myArray[i])) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }

    public boolean equals(String[] array2) {
        boolean flag = true;
        if (size != array2.length) {
            flag = false;
        } else {
            for (int i = 0; i < size; i++) {
                if (!myArray[i].equals(array2[i])) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}