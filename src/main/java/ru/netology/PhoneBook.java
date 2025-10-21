package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> names = new HashMap<>();
    Map<String, String> numbers = new HashMap<>();

    int add(String name, String phoneNumber) {
        if (name == null || phoneNumber == null) {
            throw new NullPointerException("Name and number must be not-null!");
        }
        if (names.putIfAbsent(name, phoneNumber) == null) {
            numbers.put(phoneNumber, name);
        }
        return names.size();
    }

    String findByNumber(String phoneNumber) {
        return numbers.get(phoneNumber);
    }
}
