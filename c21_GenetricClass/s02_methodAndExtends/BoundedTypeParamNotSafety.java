package c21_GenetricClass.s02_methodAndExtends;

class BoundedTypeParamNotSafety {
    public <T> void showInstanceAncestor(T param) {
        ((SimpleInterface) param).showYourName();
    }

    public <T> void showInstanceName(T param) {
        ((UpperClass) param).showYourAncestor();
    }
}
