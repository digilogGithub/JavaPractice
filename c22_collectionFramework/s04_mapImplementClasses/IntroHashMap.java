package c22_collectionFramework.s04_mapImplementClasses;

import java.util.HashMap;

class IntroHashMap {
    void showDemo() {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(new Integer(3), "나삼번");
        hashMap.put(5, "윤오번");
        hashMap.put(8, "박팔번");

        System.out.println("6학년 3반 8번 학생 : " + hashMap.get(new Integer(8)));
        System.out.println("6학년 3반 5번 학생 : " + hashMap.get(5));
        System.out.println("6학년 3반 3번 학생 : " + hashMap.get(3));
    }
}
