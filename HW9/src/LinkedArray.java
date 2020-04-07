
    import java.util.Collection;

    public class LinkedArray implements CustomCollection{
        public Link first; // Ссылка на первый элемент списка
        private Link last;
        public int count = 0, key = 0;

        public LinkedArray() {
            this.first = null;
            this.last = null;
        }

        public boolean isEmpty() {
            return (first==null);
        }

        public void displayList(){
            System.out.println("List (first-->last): ");
            Link current = first;
            while(current != null) {
                current.displayLink();
                current = current.next;
            }
            System.out.println();
        }

        @Override
        public boolean add(String str) {
            Link newLink = new Link(str, key);
            if(isEmpty()) first = newLink;
            else last.next = newLink;
            last = newLink;
            count++; key++;
            return true;
        }

        @Override
        public boolean addAll(String[] strArr) {
            for (String s : strArr) {
                Link newLink = new Link(s, key);
                if (isEmpty()) first = newLink;
                else last.next = newLink;
                last = newLink;
                count++;
                key++;
            }
            return true;
        }
        @Override
        public boolean addAll(Collection strColl) {
            for(Object lines : strColl){
                Link newLink = new Link((String)lines, key);
                if(isEmpty()) first = newLink;
                else last.next = newLink;
                last = newLink;
                count++; key++;
            }
            return true;
        }

        @Override
        public boolean delete(int index) {
            Link current = first;
            Link previous = first;
            while(current.key != index) {
                if(current.next == null) return false; // Элемент не найден
                else {
                    previous = current; // Перейти к следующему элементу
                    current = current.next;
                }
            }
            if(current == first) first = first.next;
            else previous.next = current.next;
            count--;
            return true;
        }

        @Override
        public boolean delete(String str) {
            Link current = first;
            Link previous = first;
            if(!contains(str)) return false;
            else{
                while(!current.line.equals(str)){
                    previous = current;
                    current = current.next;
                }
                if(current == first) first = first.next;
                else previous.next = current.next; // обойти его в списке
                count--;
                return true;
            }
        }

        @Override
        public String get(int index) {
            Link current = first; // Начиная с 'first'
            while(current.key != index){ // Пока совпадение не найдено
                if(current.next == null) return null; // и совпадение не найдено
                else current = current.next; // Перейти к следующему элементу
            }
            return current.line;
        }

        @Override
        public boolean contains(String str) {
            Link current = first;
            while(!current.line.equals(str)){
                if(current.next == null) return false;
                else current = current.next;
            }
            return true;
        }

        @Override
        public boolean clear() {
            if(isEmpty()) return false;
            else{
                first = null;
                last = null;
                count = 0;
                return true;
            }
        }

        @Override
        public int size() {
            return count;
        }

        @Override
        public boolean trim() {
            return true;
        }

        @Override
        public boolean compare(Collection coll) {
            Link current = first;
            if (coll.size() != count) return false;
            else {
                for (Object lines : coll) {
                    if(!current.line.equals(lines)) return false;
                    current = current.next;
                }
                return true;
            }
        }
    }


