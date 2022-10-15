import java.util.*;

public class MyTrickyCollection <T> implements Deque <T> {

    public int index = 0;
    public int linkCount = 0;
    //    private Object first;
//    private Object previous;
//    private Object data;
//    public KindOfTriplet<T> triplet = new KindOfTriplet(first, previous, data);

    public ArrayList <T> current = new ArrayList<T>();
    @Override
    public boolean add(T t) {
        if ( index< 5 ) {
            current.add(t);
            System.out.println(current);
            index++;
        } else if (index == 5) {
            ArrayList <T> timeout = new ArrayList<>();
            for (int i = 0; i < current.size(); i++){
                timeout.add(current.get(i));
            }
            current.clear();
            current.add(t);
            index = 0;
            KindOfTriplet <ArrayList <T>, ArrayList <T>, ArrayList <T>> link = KindOfTriplet.of(null, null,null);
            link.setData(timeout,linkCount);
            linkCount++;
            System.out.println(link.getData()+ "Link to the past triplet");
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
