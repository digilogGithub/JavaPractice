package c22_collectionFramework.s02_collectionImplementClasses;

import java.util.Iterator;
import java.util.LinkedList;

class UsefulIterator {

    public void showDemo() {
        LinkedList<String> collection = new LinkedList<>();
//        HashSet<String> collection = new HashSet<>();
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        collection.add("Fourth");

        Iterator<String> iterator = collection.iterator();

        System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
        while (iterator.hasNext()) {
            String curStr = iterator.next();
            System.out.println(curStr);
            if (curStr.compareTo("Third") == 0)
                iterator.remove();
        }

        System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            String curStr = iterator.next();
            System.out.println(curStr);
        }
    }

}
