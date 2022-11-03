import java.util.*;


public class MyTrickyCollection <T> implements Deque<T>  {
    private KindOfTriplet <T> left;
    private KindOfTriplet <T> right;
    private int count = 0;
    private int index = -1;
    private int temp = 0;

    private int maxSize = 1000;
    public class MyTrickyIterator <T> implements Iterator <T>{
        private KindOfTriplet <T> element = (KindOfTriplet<T>) left;
        private int cursor = 0;
        private int remaining = size();
        public MyTrickyIterator () {
            if (element.getData()[0] == null){
                element = (KindOfTriplet<T>) left.getRightLink();
            }
        }
        @Override
        public boolean hasNext() {
            return remaining > 0;
        }

        @Override
        public T next() {
            if (remaining <= 0)
                throw new NoSuchElementException();
            Object[] es = element.getData();
            T el = (T) es [cursor];
            cursor ++;
            if (cursor == 5){
                cursor = 0;
                element = element.getRightLink();
            }
            remaining--;
            return el;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }
    public MyTrickyCollection() {
        KindOfTriplet <T> startTriplet = new KindOfTriplet<>(null, null);
        this.left = startTriplet;
        this.right = startTriplet ;
    }
    @Override
    public void clear() {
        throw new IllegalAccessError();
    }
    @Override
    public Object[] toArray() {
        throw new IllegalAccessError();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new IllegalAccessError();
    }
    @Override
    public boolean containsAll(Collection c) {
        throw new IllegalAccessError();
    }
    @Override
    public Iterator descendingIterator() {
        throw new IllegalAccessError();
    }
    @Override
    public boolean retainAll(Collection c) {
        throw new IllegalAccessError();
    }
    @Override
    public boolean removeAll(Collection c) {
        throw new IllegalAccessError();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean add(T t) {
        if (t != null) {
            if (right.getIndexRight() == right.getCapacity()) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(right, null); // Сказали, что для новго триплета старый идет в начало
                right.setRightLink(triplet); // Сказали, что для старого триплета новый идет в хвост
                right = triplet; // Сказал, что теперь старый триплет стал новым
                index = 0;
            }
            right.setData(t, right.getIndexRight());
            right.setIndexRight(right.getIndexRight() + 1);
            count++;
            index++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
            return true;
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
        return false;
    }

    @Override
    public void addFirst(T t) {
        if (t != null) {
            if (left.getIndexLeft() == 0) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(null, left); // Сказали, что для новго триплета старый идет в конец
                left.setLeftLink(triplet); // Сказали, что для старого триплета новый идет в начало
                left = triplet; // Сказал, что теперь старый триплет стал новым
                temp = 0;
                if (right.getData()[0] == null){
                    right = left;
                }
            }
            left.setIndexLeft(4 - temp);
            temp++;
            left.setData(t, left.getIndexLeft());
            count++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
    }
    @Override
    public boolean offerFirst(T t) {
        if (t != null) {
            if (left.getIndexRight() == 0) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(null, left); // Сказали, что для новго триплета старый идет в конец
                left.setLeftLink(triplet); // Сказали, что для старого триплета новый идет в начало
                left = triplet; // Сказал, что теперь старый триплет стал новым
                temp = 0;
            }
            left.setIndexLeft(4 - temp);
            temp++;
            left.setData(t, left.getIndexLeft());
            count++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
            return true;
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
        return false;
    }
    @Override
    public void push(T t) {
        if (index != 0){
            left.setIndexRight(0);
            index = 0;
        }
        if (t != null) {
            if (left.getIndexRight() == 0) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(null, left); // Сказали, что для новго триплета старый идет в конец
                left.setLeftLink(triplet); // Сказали, что для старого триплета новый идет в начало
                left = triplet; // Сказал, что теперь старый триплет стал новым
                temp = 0;
            }
            left.setIndexRight(4 - temp);
            temp++;
            left.setData(t, left.getIndexRight());
            count++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
    }
    @Override
    public void addLast(T t) {
        if (t != null) {
            if (right.getIndexRight() == right.getCapacity()) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(right, null); // Сказали, что для новго триплета старый идет в начало
                right.setRightLink(triplet); // Сказали, что для старого триплета новый идет в хвост
                right = triplet; // Сказал, что теперь старый триплет стал новым
                index = 0;
            }
            index++;
            right.setData(t, right.getIndexRight());
            right.setIndexRight(right.getIndexRight() + 1);
            count++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
    }
    @Override
    public boolean offerLast(T t) {
        if (t != null) {
            if (right.getIndexRight() == right.getCapacity()) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(right, null); // Сказали, что для новго триплета старый идет в начало
                right.setRightLink(triplet); // Сказали, что для старого триплета новый идет в хвост
                right = triplet; // Сказал, что теперь старый триплет стал новым
                index = 0;
            }
            right.setData(t, right.getIndexRight());
            right.setIndexRight(right.getIndexRight() + 1);
            count++;
            index++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
            return true;
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
        return false;
    }
    @Override
    public boolean offer(T t) {
        if (t != null) {
            if (right.getIndexRight() == right.getCapacity()) {
                KindOfTriplet<T> triplet = new KindOfTriplet<>(right, null); // Сказали, что для новго триплета старый идет в начало
                right.setRightLink(triplet); // Сказали, что для старого триплета новый идет в хвост
                right = triplet; // Сказал, что теперь старый триплет стал новым
                index = 0;
            }
            right.setData(t, right.getIndexRight());
            right.setIndexRight(right.getIndexRight() + 1);
            count++;
            index++;
            if (count == maxSize) {
                System.err.println("\n" + "Element cannot be added at this time due to capacity restrictions" + "\n");
                throw new IllegalStateException();
            }
            return true;
        } else if (t == null){
            System.err.println("\n"+"Deque does not permit null elements"+"\n");
            throw new NullPointerException();
        }
        return false;
    }

    @Override
    public T getFirst() {
        for (Object el: left.getData()) {
            if (el != null ) {
                return (T) el;
            }
        }
        System.err.println("\n"+"Deque is empty");
        throw new NoSuchElementException();
    }
    @Override
    public T peekFirst() {
        try {
            return getFirst();
        } catch (NoSuchElementException error){
            return null;
        }
    }
    @Override
    public T getLast() {
        if (isEmpty()){
            System.err.println("\n" + "Deque is empty");
            throw new NoSuchElementException();
        }
        boolean check = false;
        if (right == left && index == -1){
            check = true;
        }
        if ((right.getIndexRight() == 0) && (right.getData()[0] != null)){
            return (T) right.getData()[0];
        }
        if ((right.getIndexRight() == 0) && (right.getData()[0] != null) && (right.getLeftLink() != null)) {
            return (T) right.getData() [right.getIndexRight()-1];
        }
        if (check == false){
            return (T) right.getData() [right.getIndexRight()-1];
        } else if (check){
            return (T) right.getData() [right.getIndexLeft()+2];
        }
        return null;
    }
    @Override
    public T peekLast() {
        try {
            return getLast();
        } catch (NoSuchElementException error){
            return null;
        }
    }

    @Override
    public T pollLast() {
        try {
            return removeLast();
        } catch (NoSuchElementException error){
            return null;
        }
    }

    @Override
    public T removeFirst() {
        int i = 0;
        Object ret = null;
        if (isEmpty()){
            throw new  NoSuchElementException ();
        }
        for (Object el: left.getData()) { //Использую foreach
            if (el != null) {
                ret = el;
                left.getData()[i] = null;
                left.setIndexLeft(left.getIndexLeft() - 1);
                count--;
                return (T) ret;
            }
            i++;
        }
        return  null;
    }

    @Override
    public T pop() {
        int i = 0;
        Object ret = null;
        if (isEmpty()){
            throw new  NoSuchElementException ();
        }
        for (Object el: left.getData()) { //Использую foreach
            if (el != null) {
                ret = el;
                left.getData()[i] = null;
                left.setIndexLeft(left.getIndexLeft() - 1);
                count--;
                return (T) ret;
            }
            i++;
        }
        return (T) null;
    }

    @Override
    public T removeLast() {
        if (isEmpty()){
            throw new  NoSuchElementException ();
        }
        Object ret = null;
        boolean check = false;
        if (right == left && index == -1){
            check = true;
        }
        if ((right.getIndexRight() == 1) && (right.getData()[0] != null) && (right.getLeftLink() == null)){
            ret = right.getData()[0];
            right.getData() [0] = null;
            count--;
            return (T) ret;
        }
        if ((right.getIndexRight() == 1) && (right.getData()[0] != null) && (right.getLeftLink().getData() != null)) {
            ret = right.getData() [right.getIndexRight()-1];
            right = right.getLeftLink();
            right.setRightLink(null);
            count--;
            return (T) ret;
        }
        if (check == false){
            ret = right.getData() [right.getIndexRight()-1];
            right.getData() [right.getIndexRight()-1] = null;
            right.setIndexRight(right.getIndexRight()-1);
            count--;
        } else if (check){
            ret = right.getData() [right.getIndexLeft()];
            right.getData() [right.getIndexLeft()] = null;
            right.setIndexLeft(right.getIndexLeft()-1);
            count--;
        }
        return (T) ret;
    }

    @Override
    public T pollFirst() {
        try {
            return removeFirst();
        } catch (NoSuchElementException error){
            return null;
        }
    }
    @Override
    public T peek() {
        try {
            return getFirst();
        } catch (NoSuchElementException error){
            return null;
        }
    }
    @Override
    public T remove() {
        int i = 0;
        Object ret = null;
        if (isEmpty()){
            throw new  NoSuchElementException ();
        }
        for (Object el: left.getData()) { //Использую foreach
            if (el != null) {
                ret = el;
                left.getData()[i] = null;
                left.setIndexLeft(left.getIndexLeft() - 1);
                count--;
                return (T) ret;
            }
            i++;
        }
        return null;
    }
    @Override
    public T poll() {
        try {
            return removeFirst();
        } catch (NoSuchElementException error){
            return null;
        }
    }
    @Override
    public boolean isEmpty() {
        return  ((left.getData()[0] == null) && (left.getData()[4] == null) && (right.getData()[0] == null) && (right.getData()[4] == null));
    }

    @Override
    public T element() {
        for (Object el: left.getData()) {
            if (el != null ) {
                return (T) el;
            }
        }
        System.err.println("\n"+"Deque is empty");
        throw new NoSuchElementException();
    }
    @Override
    public boolean contains(Object e) {
        KindOfTriplet<T> container;
        if (e == null) {
            System.err.println("\n" + "Element is null and this deque does not permit null elements");
            throw new NullPointerException();
        }
        int counter = size();
        container = left;
        int i =container.getIndexLeft();
        while (counter >= 1) {
            if ((container.getData()[i] != null) && (container.getData()[i].equals(e))) {
                return true;
            }
            i++;
            counter--;
            if (i == 5){
                container = container.getRightLink();
                i = 0;
            }
        }
        return false;
    }
    @Override
    public boolean addAll(Collection c) {
        boolean check = true;
        Iterator <T> iterator = c.iterator();
        while (iterator.hasNext() && check){
            check = add(iterator.next());
        }
        return check;
    }
    @Override
    public MyTrickyIterator <T> iterator() {
        return new MyTrickyIterator<>();
    }
    @Override
    public boolean removeLastOccurrence(Object e) {
        if (isEmpty()){
            return false;
        }
        if (e == null) {
            System.err.println("\n" + "Element is null and this deque does not permit null elements");
            throw new NullPointerException();
        }
        KindOfTriplet <T> container;
        boolean check1 = false;
        int counter = size();
        int tempCounter = 0;
        container = right;
        int i = 0;
        if (index == -1){
             i =left.getIndexLeft();
        }else {
             i =right.getIndexRight()-1;
        }

        while (check1 == false) {
            if ((container.getData()[i] != null) && (container.getData()[i].equals(e))) {
                check1 = true;
                tempCounter = counter;
            }
            if (check1 == false) {
                i--;
                counter--;
            }
            if (i == 0) {
                if ((container.getData()[i] != null) && (container.getData()[i].equals(e))) {
                    check1 = true;
                    tempCounter = counter;
                }
                container = container.getLeftLink();
                i = 4;
            }
        }
        if (check1) {
            i = 0;
            container = left;
            KindOfTriplet<T> change = new KindOfTriplet<>(null, null);
            left = change;
            for (int j = 0; j < (size() - tempCounter); j++){
                left.setData((T) container.getData()[i], i);
                i++;
                if (i == 5) {
                    KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                    left.setRightLink(triplet);
                    left = triplet;
                    container = container.getRightLink();
                    i = 0;
                }
            }
            left.getData()[i] = null;
            while (tempCounter-1 > 0){
                if (container.getData()[i] != null && i != 4){
                    left.setData((T) container.getData()[i+1], i);
                }
                i++;
                if (i == 5) {
                    KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                    left.setRightLink(triplet);
                    left = triplet;
                    container = container.getRightLink();
                    i = 0;
                }
                tempCounter--;
            }
            }
        if (check1 == false){
            return false;
        } else if (check1){
            count--;
            return true;
        }
        return false;
    }
    @Override
    public boolean removeFirstOccurrence(Object e) {
        if (isEmpty()){
            return false;
        }
        if (e == null) {
            System.err.println("\n" + "Element is null and this deque does not permit null elements");
            throw new NullPointerException();
        }
        KindOfTriplet <T> container;
        boolean check1 = false;
        int counter = size();
        container = left;
        KindOfTriplet<T> change = new KindOfTriplet<>(null, null);
        left = change;
        int i =container.getIndexLeft();
        while (counter >= 1) {
            if (check1 == false){
                if ((container.getData()[i] != null) && (container.getData()[i].equals(e))) {
                    check1 = true;
                }
                if (check1 == false){
                    left.setData((T) container.getData()[i], i);
                    i++;
                    counter--;
                    if (i == 5){
                        KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                        left.setRightLink(triplet);
                        left = triplet;
                        container = container.getRightLink();
                        i = 0;
                }
                }
            } else if (check1){
                if (i == 4 && counter > 1){
                    KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                    left.setRightLink(triplet);
                    left = triplet;
                    container.getData()[4] = container.getRightLink().getData()[0];
                    counter--;
                    container = container.getRightLink();
                    i = 0;
                } else if (counter == 1){
                    container.getData()[4] = null;
                    return true;
                }
                container.getData()[i] = container.getData()[i+1];
                left.setData((T) container.getData()[i], i);
                counter--;
                i++;
            }
        }
        if (check1 == false){
            return false;
        } else if (check1){
            count--;
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(Object e) {
        if (isEmpty()){
            return false;
        }
        if (e == null) {
            System.err.println("\n" + "Element is null and this deque does not permit null elements");
            throw new NullPointerException();
        }
        KindOfTriplet <T> container;
        boolean check1 = false;
        int counter = size();
        container = left;
        KindOfTriplet<T> change = new KindOfTriplet<>(null, null);
        left = change;
        int i =container.getIndexLeft();
        while (counter >= 1) {
            if (check1 == false){
                if ((container.getData()[i] != null) && (container.getData()[i].equals(e))) {
                    check1 = true;
                }
                if (check1 == false){
                    left.setData((T) container.getData()[i], i);
                    i++;
                    counter--;
                    if (i == 5){
                        KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                        left.setRightLink(triplet);
                        left = triplet;
                        container = container.getRightLink();
                        i = 0;
                    }
                }
            } else if (check1){
                if (i == 4 && counter > 1){
                    KindOfTriplet<T> triplet = new KindOfTriplet<>(null, container);
                    left.setRightLink(triplet);
                    left = triplet;
                    container.getData()[4] = container.getRightLink().getData()[0];
                    counter--;
                    container = container.getRightLink();
                    i = 0;
                } else if (counter == 1){
                    container.getData()[4] = null;
                    return true;
                }
                container.getData()[i] = container.getData()[i+1];
                left.setData((T) container.getData()[i], i);
                counter--;
                i++;
            }
        }
        if (check1 == false){
            return false;
        } else if (check1){
            count--;
            return true;
        }
        return false;
    }
}
