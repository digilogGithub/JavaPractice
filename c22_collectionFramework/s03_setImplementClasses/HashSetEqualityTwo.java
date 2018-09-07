package c22_collectionFramework.s03_setImplementClasses;

import java.util.HashSet;
import java.util.Iterator;

class HashSetEqualityTwo {
    public void showDemo() {
        HashSet<SimpleNumber> hashSet = new HashSet<>();
        hashSet.add(new SimpleNumber(10));
        hashSet.add(new SimpleNumber(20));
        hashSet.add(new SimpleNumber(20));

        System.out.println("저장된 데이터 수 : " + hashSet.size());

        Iterator<SimpleNumber> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
