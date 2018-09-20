package c21_GenetricClass.s02_methodAndExtends;

class IntroWildCard {
    public <T extends Fruit> void openAndShowFruitBox(FruitBox<T> box) {
//    public void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }
}
