package c21_GenetricClass.s02_methodAndExtends;

class Client {
    public static void main(String[] args) {

        AAA aaa = new AAA();
        BBB bbb = new BBB();
        String[] strings = new String[]{
                "Hi!",
                "I'm so happy",
                "Java Generic Programing"
        };

        System.out.println("InstanceTypeShower");
        InstanceTypeShower instanceTypeShower = new InstanceTypeShower();
        instanceTypeShower.<AAA>showInstType(aaa);
        instanceTypeShower.<BBB>showInstType(bbb);
        instanceTypeShower.showPrintCnt();

        System.out.println();
        System.out.println("InstanceTypeShower2");
        InstanceTypeShower2 instanceTypeShower2 = new InstanceTypeShower2();
        instanceTypeShower2.<AAA, BBB>showInstType(aaa, bbb);
        instanceTypeShower2.showInstType(aaa, bbb);

        System.out.println();
        System.out.println("BoundedTypeParamNotSafety");
        BoundedTypeParamNotSafety boundedTypeParamNotSafety = new BoundedTypeParamNotSafety();
        boundedTypeParamNotSafety.showInstanceAncestor(aaa);
        boundedTypeParamNotSafety.showInstanceName(aaa);
        boundedTypeParamNotSafety.showInstanceAncestor(bbb);
        boundedTypeParamNotSafety.showInstanceName(bbb);

        System.out.println();
        System.out.println("BoundedTypeParamSafety");
        BoundedTypeParamSafety boundedTypeParamSafety = new BoundedTypeParamSafety();
        boundedTypeParamSafety.showInstanceAncestor(aaa);
        boundedTypeParamSafety.showInstanceName(aaa);
        boundedTypeParamSafety.showInstanceAncestor(bbb);
        boundedTypeParamSafety.showInstanceName(bbb);

        System.out.println();
        System.out.println("IntroGenericArray");
        IntroGenericArray introGenericArray = new IntroGenericArray();
        introGenericArray.showArrayData(strings);

        System.out.println();
        System.out.println("IntroWildCard");
        FruitBox<Fruit> box1 = new FruitBox<>();
        box1.store(new Fruit());

        FruitBox<Apple> box2 = new FruitBox<>();
        box2.store(new Apple());

        IntroWildCard introWildCard = new IntroWildCard();
        System.out.println("Fruit");
        introWildCard.openAndShowFruitBox(box1);
        System.out.println("Apple");
        introWildCard.openAndShowFruitBox(box2);
    }
}



