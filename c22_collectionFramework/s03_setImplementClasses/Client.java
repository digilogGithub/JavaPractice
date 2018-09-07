package c22_collectionFramework.s03_setImplementClasses;

class Client {
    public static void main(String[] args) {

        System.out.println("SetInterfaceFeature");
        SetInterfaceFeature setInterfaceFeature = new SetInterfaceFeature();
        setInterfaceFeature.showDemo();
        System.out.println();
        System.out.println("HashSetEqualityOne");
        HashSetEqualityOne hashSetEqualityOne = new HashSetEqualityOne();
        hashSetEqualityOne.showDemo();
        System.out.println();
        System.out.println("HashSetEqualityTwo");
        HashSetEqualityTwo hashSetEqualityTwo = new HashSetEqualityTwo();
        hashSetEqualityTwo.showDemo();

        System.out.println();
        System.out.println("SortTreeSet");
        SortTreeSet sortTreeSet = new SortTreeSet();
        sortTreeSet.showDemo();

        System.out.println();
        System.out.println("ComparablePerson");
        ComparablePerson comparablePerson = new ComparablePerson();
        comparablePerson.showDemo();

        System.out.println();
        System.out.println("IntroComparator");
        IntroComparator introComparator = new IntroComparator();
        introComparator.showDemo();
    }
}

