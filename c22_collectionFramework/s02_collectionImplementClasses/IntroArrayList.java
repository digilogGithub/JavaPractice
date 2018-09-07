package c22_collectionFramework.s02_collectionImplementClasses;

import java.util.ArrayList;

class IntroArrayList {
    void showList() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(11));
        list.add(22);
        list.add(new Integer(22) + 11);

        System.out.println("1차 참조");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        System.out.println("2차 참조");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
