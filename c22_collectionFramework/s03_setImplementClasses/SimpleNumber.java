package c22_collectionFramework.s03_setImplementClasses;

class SimpleNumber {
    int num;

    public SimpleNumber(int num) {
        this.num = num;
    }

    public int hashCode() {
        return num % 3;
    }

    public boolean equals(Object object) {
        SimpleNumber comp = (SimpleNumber) object;
        if (comp.num == num)
            return true;
        else
            return false;
    }

    public String toString() {
        return String.valueOf(num);
    }
}
