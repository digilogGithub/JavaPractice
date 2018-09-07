package c22_collectionFramework.s04_mapImplementClasses;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

class IntroTreeMap {
    void showDemo() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "data1");
        treeMap.put(3, "data3");
        treeMap.put(5, "data5");
        treeMap.put(2, "data2");
        treeMap.put(4, "data4");

        NavigableSet<Integer> navi = treeMap.navigableKeySet();

        System.out.println("오름차순 출력...");
        Iterator<Integer> integerIterator = navi.iterator();
        while (integerIterator.hasNext())
            System.out.println(treeMap.get(integerIterator.next()));

        System.out.println("내림차순 출력...");
        integerIterator = navi.descendingIterator();
        while (integerIterator.hasNext())
            System.out.println(treeMap.get(integerIterator.next()));
    }
}
