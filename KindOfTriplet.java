public class KindOfTriplet <T> {
        private int capacity = 5;
        private Object [] data;
        private KindOfTriplet<T> leftLink;
        private KindOfTriplet <T> rightLink;
        private int indexRight;
        private int indexLeft;

        public KindOfTriplet(KindOfTriplet <T> leftLink, KindOfTriplet <T> rightLink) {
                this.data = new Object[capacity];
                this.leftLink = leftLink;
                this.rightLink = rightLink;
                this.indexRight = 0;
                this.indexLeft = 0;
        }
        public void setIndexLeft(int indexLeft) {this.indexLeft = indexLeft;}
        public int getIndexLeft() {return indexLeft;}
        public int getCapacity() {
                return capacity;
        }

        public Object [] getData() {
                return data ;
        }

        public void setData(T currentEl, int index) {
                this.data[index] = currentEl;
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

        public int getIndexRight() {return indexRight;}
        public void setIndexRight(int indexRight) {
                this.indexRight = indexRight;
        }

}