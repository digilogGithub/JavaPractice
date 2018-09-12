package c19_memoryObject.s02_ObjectClass;

class Client {
    public static void main(String[] args) {
        System.out.println("ObjectFinalize");
        ObjectFinalize objectFinalize = new ObjectFinalize();
        objectFinalize.showDamo();

        System.out.println();
        System.out.println("ShallowCopy");
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.showDemo();

        System.out.println();
        System.out.println("DeepCopy");
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.showDemo();

        System.out.println();
        System.out.println("StringCopy");
        StringCopy stringCopy = new StringCopy();
        stringCopy.showDemo();
    }
}

