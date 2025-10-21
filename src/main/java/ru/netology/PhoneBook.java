package ru.netology;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    Set<String> names = new HashSet<>();

    int add(String name, String phoneNumber) {
        names.add(name);
        return names.size();
    }

    String findByNumber(String phoneNumber) {
        return null;
    }
}
