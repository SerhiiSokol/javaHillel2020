public class Link {
    public Link next; // Ссылка на следующий элемент списка
    String line;
    int key;

    public Link(String line, int key) {
        this.line = line;
        this.key = key;
    }

    public void displayLink() // Вывод содержимого элемента
    {
        System.out.println("{ Строка: " + line + ", ключ: " + key + "}");
    }
}