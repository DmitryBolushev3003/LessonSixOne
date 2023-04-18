package org.example.LessonSixOne.ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class monthServiceTest {

    // Задание 2
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/budget.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        monthService service = new monthService();

        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    // Задание 1
    @Test
    public void test() {
        monthService service = new monthService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwo() {
        monthService service = new monthService();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }
}
