package c21_GenetricClass.s02_methodAndExtends;

class AAA extends UpperClass implements SimpleInterface {
    public String toString() {
        return "Class AAA";
    }

    @Override
    public void showYourName() {
        System.out.println("Class AAA");
    }
}
