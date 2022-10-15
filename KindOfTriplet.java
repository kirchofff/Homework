import java.util.ArrayList;

public class KindOfTriplet <A, B, C> extends ArrayList{
        public  A previous;

        public ArrayList <B> data = new ArrayList<>();

        public  C first;

        public int stockCapacity = 5;


        public int index;

        public KindOfTriplet( A previous, B data, C first) {
                this.first = first;
                this.previous = previous;
                this.data.add(data);
        }


        public C getFirst() {
                return first;
        }

        public A getPrevious() {
                return previous;
        }

        public ArrayList<B> getData() {
                return data;
        }

        public void setFirst(C first) {
                this.first = first;
        }

        public void setPrevious(A previous) {
                this.previous = previous;
        }

        public void setData(B data, int num) {
                this.data.add  (num, data);
        }

        public static <B, C, A> KindOfTriplet <B, C, A> of (B a, C b, A c) {
               return new KindOfTriplet<>(a, b, c);
        }
//        public void clearData(ArrayList<T> data) {
//                this.data.clear();
//        }
//
//
//        public void setData(ArrayList data) {
//                this.data = data;
//        }
//
//        public KindOfTriplet<T> getFirst() {
//                return first;
//        }
//
//        public int getIndex() {
//                return index;
//        }
//
//        public void setIndex(int index) {
//                this.index = index;
//        }
//
//        public void setPrevious(KindOfTriplet<T> previous) {
//                this.previous = previous;
//        }
//
//        public KindOfTriplet<T> getPrevious() {
//                return previous;
//        }
//
//        public void setFirst(KindOfTriplet<T> first) {
//                this.first = first;
//        }
//
//        public ArrayList getData() {
//                return data;
//        }
}

