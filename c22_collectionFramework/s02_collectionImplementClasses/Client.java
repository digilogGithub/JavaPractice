package c22_collectionFramework.s02_collectionImplementClasses;

class Client {
    public static void main(String[] args) {
        System.out.println("IntroArrayList");
        IntroArrayList introArrayList = new IntroArrayList();
        introArrayList.showList();
        System.out.println();
        System.out.println("IntroLinkedList");
        IntroLinkedList introLinkedList = new IntroLinkedList();
        introLinkedList.showList();

        System.out.println();
        System.out.println("SoSimpleLinkedListImpl");
        SoSimpleLinkedListImpl soSimpleLinkedList = new SoSimpleLinkedListImpl();
        soSimpleLinkedList.showDemo();

        System.out.println();
        System.out.println("UsefulIterator");
        UsefulIterator usefulIterator = new UsefulIterator();
        usefulIterator.showDemo();
    }
}


