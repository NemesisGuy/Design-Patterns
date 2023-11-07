package behavioralPatterns.iterator;

import java.util.Iterator;

class MyCollection<T> implements Iterable<T> {
    private T[] elements;

    public MyCollection(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public T next() {
            return elements[index++];
        }
    }
}
