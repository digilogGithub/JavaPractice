package c22_collectionFramework.s03_setImplementClasses;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showData() {
        System.out.printf("%s %d \n", name, age);
    }

    @Override
    public int compareTo(Person person) {
        if (age > person.age)
            return 1;
        else if (age < person.age)
            return -1;
        else
            return 0;
    }
}
