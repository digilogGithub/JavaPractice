package c22_collectionFramework.s03_setImplementClasses;

import java.util.Comparator;

class StrLenComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
//        if (str1.length() > str2.length())
//            return 1;
//        else if (str1.length() < str2.length())
//            return -1;
//        else
//            return 0;
        return str1.length() - str2.length();
//        return  str2.length() - str1.length();
    }
}
