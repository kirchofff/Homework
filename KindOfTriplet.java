import java.util.ArrayList;

public class KindOfTriplet <T> {
        private int capacity = 5;
        private Object [] value;
        private KindOfTriplet<T> leftLink;
        private KindOfTriplet <T> rightLink;
        private int index;

        public KindOfTriplet(KindOfTriplet <T> leftLink, KindOfTriplet <T> rightLink) {
                this.value = new Object[capacity];
                this.leftLink = leftLink;
                this.rightLink = rightLink;
        }

        public int getCapacity() {
                return capacity;
        }

        public Object getValue(int index) {
                return value [index];
        }

        public void setValue(T currentEl, int index) {
                this.value [index] = currentEl;
        }

        public KindOfTriplet<T> getLeftLink() {
                return leftLink;
        }

        public void setLeftLink(KindOfTriplet <T> leftLink) {
                this.leftLink = leftLink;
        }

        public KindOfTriplet<T> getRightLink() {
                return rightLink;
        }

        public void setRightLink(KindOfTriplet <T> rightLink) {
                this.rightLink = rightLink;
        }

        public int getIndex() {
                return index;
        }

        public void setIndex(int index) {
                this.index = index;
        }

}