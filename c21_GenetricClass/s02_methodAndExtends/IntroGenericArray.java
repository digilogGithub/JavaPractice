package c21_GenetricClass.s02_methodAndExtends;

class IntroGenericArray {
    public <T> void showArrayData(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
