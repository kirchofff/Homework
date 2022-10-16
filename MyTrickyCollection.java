import java.util.*;

public class MyTrickyCollection <T> implements Deque <T> {

    public int index = 0;
    //    private Object first;
//    private Object previous;
//    private Object data;
//    public KindOfTriplet<T> triplet = new KindOfTriplet(first, previous, data);

    public ArrayList <T> current = new ArrayList<T>(5);
    public ArrayList <T> newCurrent = new ArrayList<>(5);
    @Override
    public boolean add(T t) {
        KindOfTriplet <ArrayList <T>, ArrayList <T>, ArrayList <T>> link = KindOfTriplet.of(null,null,null);
        if ( index< 5 ) {
            current.add(t);
            index++;
            link.setData(current);
            System.out.println(link.previous+"__"+link.data+ "Link to the past triplet");
        } else if (index >= 5 && index <10) {
            newCurrent.add(t);
            KindOfTriplet <ArrayList <T>, ArrayList <T>, ArrayList <T>> link = KindOfTriplet.of(current, newCurrent,null);
            index++;
            System.out.println(link.previous+"__"+link.data+ "Link to the past triplet");
        } else if (index == 10) {
            KindOfTriplet <ArrayList <T>, ArrayList <T>, ArrayList <T>> link = KindOfTriplet.of(current, newCurrent,null);
            newCurrent.clear();
            current.clear();
            index =0;
            System.out.println(link.previous+"__"+link.data+ "Link to the past triplet");
        }
        return false;
    }


//    public boolean add(T t) {
//        if ( triplet.index< 5 ) {
//            triplet.data.add (t);
//            triplet.index++;
//            System.out.println(triplet.getData());
//        } else if (triplet.index == 5) {
//            triplet.setFirst((KindOfTriplet<T>) triplet.getData());
//            triplet.data.clear();
//            triplet.data.add(t);
//            System.out.println(triplet.getData());
//            triplet.index = 0;
//            System.out.println(triplet.getFirst()+ "______"+ "Link to the past triplet");
//        }
//    return false;
//    }
//

    @Override
    public void addFirst(T t) {
    }
    @Override
    public void addLast(Object o) {

    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }


    @Override
    public boolean offerFirst(Object o) {
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        return false;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }


    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public void push(Object o) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public Iterator descendingIterator() {
        return null;
    }
}
