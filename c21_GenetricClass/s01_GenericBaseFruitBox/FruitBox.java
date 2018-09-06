package c21_GenetricClass.s01_GenericBaseFruitBox;

class FruitBox<T> {

    T item;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }

}
