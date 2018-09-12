package c19_memoryObject.s02_ObjectClass;

class DeepCopy {
    public void showDemo() {
        RectangleDeep org = new RectangleDeep(1, 1, 9, 9);
        RectangleDeep cpy;

        try {
            cpy = (RectangleDeep) org.clone();
            org.changePos(2, 2, 7, 7);
            System.out.println("ORG");
            org.showPosition();
            System.out.println("CLONE");
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
