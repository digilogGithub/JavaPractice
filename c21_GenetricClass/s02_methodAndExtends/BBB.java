package c21_GenetricClass.s02_methodAndExtends;

class BBB extends UpperClass implements SimpleInterface {
    public String toString() {
        return "Class BBB";
    }

    @Override
    public void showYourName() {
        System.out.println("Class BBB");
    }
}
