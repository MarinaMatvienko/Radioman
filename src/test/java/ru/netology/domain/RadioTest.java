package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouleSetRadio() {
        Radio cond = new Radio();

        cond.currentRadio = 9;

        int expected = 9;
        int actual = cond.currentRadio;

        Assertions.assertEquals(expected, actual);


    }
}
