package ru.netology;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PhoneBookTest {
    private static long suiteStartTime;
    private long testStartTime;
    private PhoneBook book;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running PhoneBookTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("PhoneBookTest complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        book = new PhoneBook();
        System.out.println("Starting new nest");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete: " + (System.nanoTime() - testStartTime));
    }

    @Test
    @DisplayName("Добавление одного контакта")
    public void add_1Contact_returns1() {
        int res = book.add("John Smith", "+11234567890");
        assertThat(res).isEqualTo(1);
    }

    @Test
    @DisplayName("Добавление нескольких контактов")
    public void add_3Contacts_returns3() {
        book.add("John Smith", "+11234567890");
        book.add("John Doe", "+11234567891");
        int res = book.add("John Johns", "+11234567892");
        assertThat(res).isEqualTo(3);
    }

    @Test
    @DisplayName("Добавление одинаковых контактов")
    public void add_saneContacts_returns1() {
        book.add("John Smith", "+11234567890");
        int res = book.add("John Smith", "+11234567891");
        assertThat(res).isEqualTo(1);
    }
}
