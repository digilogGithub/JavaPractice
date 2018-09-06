package c21_GenetricClass.s02_methodAndExtends;

class InstanceTypeShower2 {

    public <T, U> void showInstType(T inst1, U inst2) {
        System.out.println(inst1);
        System.out.println(inst2);
    }

}
