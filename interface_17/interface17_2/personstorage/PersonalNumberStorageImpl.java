package interface_17.interface17_2.personstorage;

import interface_17.interface17_2.personbridge.PersonalNumberStorage;

import java.util.ArrayList;
import java.util.List;

public class PersonalNumberStorageImpl implements PersonalNumberStorage {

    private List<Person> personStorage = new ArrayList<>();

    @Override
    public void addPersonalInfo(String name, String perNum) {
        personStorage.add(new Person(name, perNum));
    }

    @Override
    public String searchName(String perNum) {
        for (Person person : personStorage) {
            if (perNum.equals(person.getPerNum()))
                return person.getName();
        }
        return "There is no person who have " + perNum;
    }
}
