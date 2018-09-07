package c22_collectionFramework.s03_setImplementClasses;

import java.util.HashSet;
import java.util.Iterator;

class SetInterfaceFeature {

    void showDemo() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("First");
        hashSet.add("Second");
        hashSet.add("Third");
        hashSet.add("Fourth");

        Iterator<String> iterator = hashSet.iterator();

        System.out.println("저장된 데이터 수 : " + hashSet.size());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
