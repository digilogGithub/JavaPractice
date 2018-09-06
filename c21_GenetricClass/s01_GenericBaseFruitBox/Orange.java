package c21_GenetricClass.s01_GenericBaseFruitBox;

class Orange {
    int sugarContent;

    public Orange(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void showSugarContent() {
        System.out.println("당도 :" + sugarContent);
    }
}
