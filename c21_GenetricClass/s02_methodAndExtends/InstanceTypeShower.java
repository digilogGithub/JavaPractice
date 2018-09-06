package c21_GenetricClass.s02_methodAndExtends;

class InstanceTypeShower {
    int showCnt = 0;

    public <T> void showInstType(T inst) {
        System.out.println(inst);
        showCnt++;
    }

    void showPrintCnt() {
        System.out.println("Show cont : " + showCnt);
    }
}
