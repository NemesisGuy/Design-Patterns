package iterator;

import java.util.Iterator;

/*
* The MyCollection class implements the Iterable interface, which means it provides an iterator.

The MyIterator class is an inner class that implements the Iterator interface. It keeps track of the current index and provides hasNext and next methods.

In the Main class, we create an instance of MyCollection with an array of names. We then get an iterator from the collection and use it to iterate through the elements.

The Iterator pattern is useful when you want to provide a uniform way of accessing elements in a collection, regardless of the underlying implementation.
* It simplifies the client code by providing a standardized way to iterate through collections.
*  It's widely used in Java with interfaces like java.util.Iterator and in various collection classes provided by the standard library.
* */

public class Main {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Jim", "Jill"};
        MyCollection<String> collection = new MyCollection<>(names);

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
