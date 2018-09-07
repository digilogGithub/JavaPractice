package c22_collectionFramework.s02_collectionImplementClasses;

class SoSimpleLinkedListImpl {
    public void showDemo() {
        Box<String> boxHead = new Box<>();
        boxHead.store("First String");

        boxHead.nextBox = new Box<>();
        boxHead.nextBox.store("Second String");

        boxHead.nextBox.nextBox = new Box<>();
        boxHead.nextBox.nextBox.store("Third String");

        Box<String> tempRef;

        tempRef = boxHead.nextBox;
        System.out.println(tempRef.pullOut());

        tempRef = boxHead.nextBox.nextBox;
        System.out.println(tempRef.pullOut());

        tempRef = boxHead.nextBox;
        tempRef = tempRef.nextBox;
        System.out.println(tempRef.pullOut());
    }
}
