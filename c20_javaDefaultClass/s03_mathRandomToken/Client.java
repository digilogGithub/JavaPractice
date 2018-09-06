package c20_javaDefaultClass.s03_mathRandomToken;

class Client {
    public static void main(String[] args) {
        //Math
        MathExam mathExam = new MathExam();
        mathExam.showMath();

        RandomSeed seed = new RandomSeed();
        seed.showRandom();
        seed.showRandom();

        seed.showRandomSeed();
        seed.showRandomSeed();

        seed.showRandomSeedMilis();
        seed.showRandomSeedMilis();
        System.out.println();
        System.out.println();


        TokennizeString2 tokennizeString2 = new TokennizeString2();
        tokennizeString2.showToken();
    }

}

