package c20_javaDefaultClass.s03_mathRandomToken;

import java.util.Random;

class RandomSeed {
    void showRandom() {
        System.out.println();
        System.out.println("Random");
        Random seed = new Random();
        for (int i = 0; i < 20; i++)
            System.out.print(seed.nextInt(1000) + " ");
    }

    void showRandomSeed() {
        System.out.println();
        System.out.println("Random Seed");
        Random seed = new Random(12);
        for (int i = 0; i < 20; i++)
            System.out.print(seed.nextInt(1000) + " ");
    }

    void showRandomSeedMilis() {
        System.out.println();
        System.out.println("Random Seed Millisecond");
        Random seedMilis = new Random(12);
        seedMilis.setSeed(System.currentTimeMillis());

        for (int i = 0; i < 20; i++)
            System.out.print(seedMilis.nextInt(1000) + " ");
    }
}
