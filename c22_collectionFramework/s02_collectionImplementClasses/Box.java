package c22_collectionFramework.s02_collectionImplementClasses;

class Box<T> {
    public Box<T> nextBox;
    T item;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }
}
