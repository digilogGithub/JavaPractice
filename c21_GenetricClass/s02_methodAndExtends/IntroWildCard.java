package c21_GenetricClass.s02_methodAndExtends;

class IntroWildCard {
    public void openAndShowFruitBox(FruitBox<? extends Fruit> box) {
        Fruit fruit = box.pullOut();
        fruit.showYou();
    }
}
