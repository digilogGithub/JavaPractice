package c21_GenetricClass.s01_GenericBaseFruitBox;

class Client {
    public static void main(String[] args) {

        FruitBox<Orange> orangeFruitBox = new FruitBox<>();
        orangeFruitBox.store(new Orange(10));
        Orange orange = orangeFruitBox.pullOut();
        orange.showSugarContent();

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.store(new Apple(20));
        Apple apple = appleFruitBox.pullOut();
        apple.showAppleWeight();
    }
}

