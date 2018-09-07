package c22_collectionFramework.s03_setImplementClasses;

import java.util.Iterator;
import java.util.TreeSet;

class ComparablePerson {

    public void showDemo() {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Lee", 24));
        treeSet.add(new Person("Hong", 29));
        treeSet.add(new Person("Choi", 21));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext())
            iterator.next().showData();
    }
}
