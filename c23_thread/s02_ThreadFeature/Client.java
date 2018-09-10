package c23_thread.s02_ThreadFeature;

class Client {
    public static void main(String[] args) {
        System.out.println("PriorityTestOne");
        PriorityTestOne priorityTestOne = new PriorityTestOne();
        priorityTestOne.showDemo();

        System.out.println();
        System.out.println("PriorityTestTwo");
        PriorityTestTwo priorityTestTwo = new PriorityTestTwo();
        priorityTestTwo.showDemo();

        System.out.println();
        System.out.println("PriorityTestThree");
        PriorityTestThree priorityTestThree = new PriorityTestThree();
        priorityTestThree.showDemo();

        System.out.println();
        System.out.println("ThreadHeapMultiAccess");
        ThreadHeapMultiAccess threadHeapMultiAccess = new ThreadHeapMultiAccess();
        threadHeapMultiAccess.showDemo();
    }
}



