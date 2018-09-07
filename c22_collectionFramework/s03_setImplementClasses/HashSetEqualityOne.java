package c22_collectionFramework.s03_setImplementClasses;

import java.util.HashSet;
import java.util.Iterator;

class HashSetEqualityOne {
    public void showDemo() {
        HashSet<SimpleNumberDefault> hashSet = new HashSet<>();
        hashSet.add(new SimpleNumberDefault(10));
        hashSet.add(new SimpleNumberDefault(20));
        hashSet.add(new SimpleNumberDefault(20));

        System.out.println("저장된 데이터 수 : " + hashSet.size());

        Iterator<SimpleNumberDefault> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
