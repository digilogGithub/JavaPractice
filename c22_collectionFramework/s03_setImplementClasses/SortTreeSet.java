package c22_collectionFramework.s03_setImplementClasses;

import java.util.Iterator;
import java.util.TreeSet;

class SortTreeSet {
    public void showDemo() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println("저장된 데이터 수 : " + treeSet.size());

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
