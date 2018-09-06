package c21_GenetricClass.s02_methodAndExtends;

class FruitBox<T> {
    T item;

    public void store(T item) {
        this.item = item;
    }

    public T pullOut() {
        return item;
    }
}
