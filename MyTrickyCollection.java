import java.util.*;

public class MyTrickyCollection <T> implements Deque <T> {
    private KindOfTriplet <T> left;
    private KindOfTriplet <T> right;
    private KindOfTriplet <T> current;
    private int count = 0;

    public MyTrickyCollection() {
        KindOfTriplet <T> triplet = new KindOfTriplet<>(null, null);
        this.left = left;
        this.right = right;
    }
    @Override
    public int size() {
        return count;
//        int count = 1;
//        if (left != null){
//            KindOfTriplet <T> rightTriplet = left.getLeftLink();
//            while (rightTriplet !=null) {
//                count++;
//                rightTriplet = rightTriplet.getRightLink();
//            }
//            return count;
//        } else {
//            return 0;
//        }
    }
    @Override
    public boolean add(T t) {
        count++;
        return false;
    }

    @Override
    public void addFirst(T t) {
        count++;
    }
    @Override
    public void addLast(Object o) {
        count++;

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
        count--;
        return null;
    }

    @Override
    public T removeLast() {
        count--;
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        //////
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
