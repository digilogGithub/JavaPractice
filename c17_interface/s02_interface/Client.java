package c17_interface.s02_interface;

import c17_interface.s02_interface.personbridge.PersonalNumberStorage;
import c17_interface.s02_interface.personstorage.PersonalNumberStorageImpl;

public class Client {
    public static void main(String[] args) {
        PersonalNumberStorage personalNumberStorage = new PersonalNumberStorageImpl();

        personalNumberStorage.addPersonalInfo("김기동", "950000-1122333");
        personalNumberStorage.addPersonalInfo("장산길", "970000-1122334");

        System.out.println(personalNumberStorage.searchName("970000-1122334"));
        System.out.println(personalNumberStorage.searchName("950000-1122333"));
        System.out.println(personalNumberStorage.searchName("970001-1122334"));
    }
}
