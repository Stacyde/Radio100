package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Radio100Test {

    @Test
    public void currentSound() {
        Radio100 cond = new Radio100(); //создай радио

        int expected = 0;
        int actual = cond.getCurrentSound(); //обращаемся к методу текущий звук

        assertEquals(expected, actual);

    }

    @Test
    public void minSound() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void maxSound() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);

        int expected = 10;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void Sound11() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(11);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void Sound() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(-1);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {
        Radio100 cond = new Radio100();
        cond.increaseSound(); //увеличь звук на +1

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.reduceSound(); //уменьшить звук на -1

        int expected = 9;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSoundMin() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.reduceSoundMin(); //уменьшить звук на -1

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSoundMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.reduceSoundMax(); //увеличить звук на +1

        int expected = 10;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }


}