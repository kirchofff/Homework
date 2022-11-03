import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MyTrickyCollectionTest {

    @org.junit.jupiter.api.Test
    void size_Test1() {
        int expected = 11;
        MyTrickyCollection <String> size = new MyTrickyCollection<>();
        for (int i = 0 ; i < 11; i++){
            size.add(""+i);
        }
        int actual = size.size();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void size_Test2() {
        int expected = 0;
        MyTrickyCollection <String> size = new MyTrickyCollection<>();
        int actual = size.size();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void size_Test3() {
        int expected = 0;
        MyTrickyCollection <String> size = new MyTrickyCollection<>();
        for (int i = 0 ; i < 1; i++){
            size.addFirst(""+i);
        }
        size.removeFirst();
        int actual = size.size();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void contains1() {
        boolean expected = true;
        MyTrickyCollection <String> contains = new MyTrickyCollection<>();
        for (int i = 0 ; i < 11; i++){
            contains.add(""+i);
        }
        boolean actual = contains.contains("2");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void contains2() {
        boolean expected = false;
        MyTrickyCollection <String> contains = new MyTrickyCollection<>();
        for (int i = 0 ; i < 1; i++){
            contains.add(""+i);
        }
        contains.removeFirst();
        boolean actual = contains.contains("0");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void contains3() {
        boolean expected = true;
        MyTrickyCollection <String> contains = new MyTrickyCollection<>();
        for (int i = 0 ; i < 11; i++){
            contains.add(""+i);
        }
        for (int i = 0 ; i < 11; i++){
            contains.addFirst(""+(-i));
        }
        boolean actual = contains.contains("-10");
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void addAll1() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.addLast("1");
        ArrayList<String> collect = new ArrayList<>();
        for (int i =0; i < 6; i++){
            collect.add(""+i);
        }
        boolean actual = add.addAll(collect);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void addAll2() {
        boolean expected = false;
        ArrayList<String> collect = new ArrayList<>();

        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        for (int i = 0; i < 999;i++){
            add.addLast(""+i);
        }
        for (int i =0; i < 6; i++){
            collect.add(""+i);
        }
        try {
            add.addAll(collect);
        } catch (IllegalStateException error){
           boolean actual = false;
           Assert.assertEquals(expected, actual);
        }

    }
    @org.junit.jupiter.api.Test
    void addAll3() {
        String expected = "6";
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.addLast("1");
        ArrayList<String> collect = new ArrayList<>();
        for (int i =2; i < 7; i++){
            collect .add(""+i);
        }
        add.addAll(collect);
        String actual = add.getLast();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void add1() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.add("1");
        boolean actual = add.contains("1");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void add2() {
        String expected = "5";
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            add.add(""+i);
        }
        String actual = add.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void add3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.addLast(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void addLast1() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.add("1");
        boolean actual = add.contains("1");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void addLast2() {
        String expected = "5";
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            add.add(""+i);
        }
        String actual = add.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void addLast3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.addLast(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void offerLast1() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.offerLast("1");
        boolean actual = add.contains("1");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offerLast2() {
        String expected = "5";
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            add.offerLast(""+i);
        }
        String actual = add.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offerLast3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.offerLast(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void offer1() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        add.add("1");
        boolean actual = add.contains("1");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offer2() {
        String expected = "5";
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            add.add(""+i);
        }
        String actual = add.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offer3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.addLast(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void getFirst1() {
        String expected = "1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addLast("2");
        String actual = getF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void getFirst2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        try {
            getF.getFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void getFirst3() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.removeLast();
        try {
            getF.getFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void getFirst4() {
        String expected = "-1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addFirst("-1");
        String actual = getF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void addFirst1() {
        String expected = "1";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        addF.add("1");
        addF.add("2");
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void addFirst2() {
        String expected = "0";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            addF.add(""+i);
        }
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void addFirst3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.addFirst(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        boolean expected = true;
        MyTrickyCollection <String> empty = new MyTrickyCollection<>();
        boolean actual = empty.isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void offerFirst1() {
        String expected = "2";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        addF.offerFirst("1");
        addF.offerFirst("2");
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offerFirst2() {
        String expected = "5";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            addF.offerFirst(""+i);
        }
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void offerFirst3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.offerFirst(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void push1() {
        String expected = "1";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        addF.add("1");
        addF.add("2");
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void push2() {
        String expected = "0";
        MyTrickyCollection <String> addF = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            addF.add(""+i);
        }
        String actual = addF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void push3() {
        boolean expected = true;
        MyTrickyCollection <String> add = new MyTrickyCollection<>();
        try {
            for (int i = 0; i < 1100; i++){
                add.addFirst(""+i);
            }
        } catch (IllegalStateException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void removeFirst1() {
        String expected = "2";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        removeF.add("1");
        removeF.add("2");
        removeF.add("3");
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeFirst2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        try {
            removeF.removeFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeFirst3() {
        String expected = "-18";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        for (int i = 0; i < 20; i++){
            removeF.addLast(""+i);
        }
        for (int i = 0; i < 20; i++){
            removeF.addFirst(""+(-i));
        }
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void pollFirst1() {
        String expected = "2";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        removeF.add("1");
        removeF.add("2");
        removeF.add("3");
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pollFirst2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        try {
            removeF.removeFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pollFirst3() {
        String expected = "-18";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        for (int i = 0; i < 20; i++){
            removeF.addLast(""+i);
        }
        for (int i = 0; i < 20; i++){
            removeF.addFirst(""+(-i));
        }
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void iterator1() {
        boolean expected = true;
        MyTrickyCollection <String> next = new MyTrickyCollection<>();
        next.add("1");
        Iterator <String> iter = next.iterator();
        boolean actual = iter.hasNext();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void iterator2() {
        String expected = "29";
        String actual = null;
        MyTrickyCollection <String> next = new MyTrickyCollection<>();
        for (int i = 0; i < 30; i++){
            next.add(""+i);
        }
        Iterator <String> iter = next.iterator();
        for (int i = 0; i < 30; i++){
            actual = iter.next();
        }

        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void iterator3() {
        boolean expected = true;
        MyTrickyCollection <String> next = new MyTrickyCollection<>();
        Iterator <String> iter = next.iterator();
        try {
            String actual = iter.next();
        } catch (NoSuchElementException error){
            boolean actual = true;
            Assert.assertEquals(expected, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void removeLast1() {
        String expected = "2";
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        removeLast.addFirst("1");
        removeLast.addFirst("2");
        removeLast.addFirst("3");
        removeLast.removeLast();
        String actual = removeLast.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeLast2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        try {
            removeLast.removeLast();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeLast3() {
        String expected = "4";
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            removeLast.addLast(""+i);
        }
        for (int i = 0; i < 6; i++){
            removeLast.addFirst(""+(-i));
        }
        removeLast.removeLast();
        String actual = removeLast.getLast();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void removeFirstOccurrence1() {
        boolean expected = true;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        for (int i = 0; i < 10; i++){
            removeFO.add(""+i);
        }
        boolean actual = removeFO.removeFirstOccurrence("1");
        Iterator <String> iter = removeFO.iterator();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeFirstOccurrence2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        try {
            expected = removeFO.removeFirstOccurrence("1");
        } catch (NullPointerException error){
             actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeFirstOccurrence3() {
        boolean expected = false;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        for (int i = 0; i < 10; i++){
            removeFO.add(""+i);
        }
        removeFO.removeFirstOccurrence("1");
        boolean actual = removeFO.contains("1");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeFirstOccurrence4() {
        boolean expected = false;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        boolean actual = removeFO.removeFirstOccurrence(null);
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void removeLastOccurrence1() {
        boolean expected = false;
        MyTrickyCollection <String> removeLO = new MyTrickyCollection<>();
        for (int i = 0; i < 10; i++){
            removeLO.add(""+i);
        }
        removeLO.removeLastOccurrence("5");
        boolean actual = removeLO.contains("5");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeLastOccurrence2() {
        boolean expected = false;
        MyTrickyCollection <String> removeLO = new MyTrickyCollection<>();
        for (int i = 0; i < 9; i++){
            removeLO.addFirst(""+i);
        }
        removeLO.removeLastOccurrence("5");
        boolean actual = removeLO.contains("5");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeLastOccurrence3() {
        boolean expected = false;
        MyTrickyCollection <String> removeLO = new MyTrickyCollection<>();
        boolean actual = removeLO.removeLastOccurrence("5");
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void removeLastOccurrence4() {
        int expected = 0;
        MyTrickyCollection <String> removeLO = new MyTrickyCollection<>();
        removeLO.add(""+1);
        removeLO.removeLastOccurrence("1");
        int actual = removeLO.size();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getLast1() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        try {
            getL.getLast();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void getLast2() {
        String expected = "3";
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        getL.add("1");
        getL.add("2");
        getL.add("3");
        String actual = getL.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void getLast3() {
        String expected = "2";
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        getL.add("1");
        getL.add("2");
        getL.add("3");
        getL.removeLast();
        String actual = getL.getLast();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void pop1() {
        String expected = "2";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        removeF.add("1");
        removeF.add("2");
        removeF.add("3");
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pop2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        try {
            removeF.removeFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pop3() {
        String expected = "-18";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        for (int i = 0; i < 20; i++){
            removeF.addLast(""+i);
        }
        for (int i = 0; i < 20; i++){
            removeF.addFirst(""+(-i));
        }
        removeF.removeFirst();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void pollLast1() {
        String expected = "2";
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        removeLast.addFirst("1");
        removeLast.addFirst("2");
        removeLast.addFirst("3");
        removeLast.removeLast();
        String actual = removeLast.getLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pollLast2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        try {
            removeLast.removeLast();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void pollLast3() {
        String expected = "4";
        MyTrickyCollection <String> removeLast = new MyTrickyCollection<>();
        for (int i = 0; i < 6; i++){
            removeLast.addLast(""+i);
        }
        for (int i = 0; i < 6; i++){
            removeLast.addFirst(""+(-i));
        }
        removeLast.removeLast();
        String actual = removeLast.getLast();
        Assert.assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void peekFirst1() {
        String expected = "1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addLast("2");
        String actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peekFirst2() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peekFirst3() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.removeLast();
        actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peekFirst4() {
        String expected = "-1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addFirst("-1");
        String actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void peekLast1() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        actual = getL.peekLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peekLast2() {
        String expected = "3";
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        getL.add("1");
        getL.add("2");
        getL.add("3");
        String actual = getL.peekLast();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peekLast3() {
        String expected = "2";
        MyTrickyCollection <String> getL = new MyTrickyCollection<>();
        getL.add("1");
        getL.add("2");
        getL.add("3");
        getL.removeLast();
        String actual = getL.peekLast();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void poll1() {
        String expected = "2";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        removeF.add("1");
        removeF.add("2");
        removeF.add("3");
        removeF.poll();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void poll2() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        actual = removeF.poll();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void poll3() {
        String expected = "-18";
        MyTrickyCollection <String> removeF = new MyTrickyCollection<>();
        for (int i = 0; i < 20; i++){
            removeF.addLast(""+i);
        }
        for (int i = 0; i < 20; i++){
            removeF.addFirst(""+(-i));
        }
        removeF.poll();
        String actual = removeF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testRemove1() {
        boolean expected = true;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        for (int i = 0; i < 10; i++){
            removeFO.add(""+i);
        }
        boolean actual = removeFO.remove("1");
        Iterator <String> iter = removeFO.iterator();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void testRemove2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        try {
            expected = removeFO.remove("1");
        } catch (NullPointerException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void testRemove3() {
        boolean expected = false;
        MyTrickyCollection <String> removeFO = new MyTrickyCollection<>();
        for (int i = 0; i < 10; i++){
            removeFO.add(""+i);
        }
        removeFO.remove("1");
        boolean actual = removeFO.contains("1");
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void element1() {
        String expected = "1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addLast("2");
        String actual = getF.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void element2() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        try {
            getF.getFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void element3() {
        boolean expected = true;
        boolean actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.removeLast();
        try {
            getF.getFirst();
        } catch (NoSuchElementException error){
            actual = true;
        }
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void element4() {
        String expected = "-1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addFirst("-1");
        String actual = getF.getFirst();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void peek1() {
        String expected = "1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addLast("2");
        String actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peek2() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peek3() {
        Object expected = null;
        Object actual = false;
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.removeLast();
        actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void peek4() {
        String expected = "-1";
        MyTrickyCollection <String> getF = new MyTrickyCollection<>();
        getF.addLast("1");
        getF.addFirst("-1");
        String actual = getF.peekFirst();
        Assert.assertEquals(expected, actual);
    }
}