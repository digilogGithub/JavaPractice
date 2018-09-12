package c19_memoryObject.s02_ObjectClass;

class ShallowCopy {
    public void showDemo() {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.clone();
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
