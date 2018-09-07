package c22_collectionFramework.s03_setImplementClasses;

import java.util.Iterator;
import java.util.TreeSet;

class IntroComparator {
    public void showDemo() {
        TreeSet<String> treeSet = new TreeSet<>(new StrLenComparator()); // <<<=======================================
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Dog");
        treeSet.add("Individual");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
