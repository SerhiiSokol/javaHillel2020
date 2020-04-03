import org.jetbrains.annotations.NotNull;

public class Collection implements InterfacesOfCollection {
    private String[] myArray = new String[10];

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    private int size = 0;

    @Override
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

    @Override
    public void delete(int index) {
        if (index >= 0 && index < getSize ()) {
            for (int i = index; i < getSize () - 1; i++) {
                myArray[i] = myArray[i + 1];
            }
            size--;
        }
    }

    @Override
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

    @Override
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

    @Override
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

    @Override
    public boolean equals(@NotNull String[] array2) {
        boolean flag = true;
        if (size != array2.length) {
            flag = false;
        } else {
            for (int i = 0; i < size; i++) {
                if (myArray[i] != array2[i]) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}