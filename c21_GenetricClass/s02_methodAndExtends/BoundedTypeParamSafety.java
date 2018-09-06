package c21_GenetricClass.s02_methodAndExtends;

class BoundedTypeParamSafety {
    public <T extends SimpleInterface> void showInstanceAncestor(T param) {
        param.showYourName();
    }

    public <T extends UpperClass> void showInstanceName(T param) {
        param.showYourAncestor();
    }
}
