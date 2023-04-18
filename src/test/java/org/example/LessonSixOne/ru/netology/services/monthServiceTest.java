package org.example.LessonSixOne.ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class monthServiceTest {
    @Test
    public void test() {
        monthService service = new monthService();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}
