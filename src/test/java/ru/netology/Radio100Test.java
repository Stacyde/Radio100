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
    public void Sound_1() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(-1);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {
        Radio100 cond = new Radio100();
        cond.increaseSound(); // звук на +1

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound8() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(8);
        cond.reduceSound(); // звук на -1

        int expected = 7;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound7() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(7);
        cond.reduceSound(); // звук на -1

        int expected = 6;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound6() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(6);
        cond.reduceSound(); // звук на -1

        int expected = 5;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound5() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(5);
        cond.reduceSound(); // звук на -1

        int expected = 4;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound4() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(4);
        cond.reduceSound(); // звук на -1

        int expected = 3;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound3() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(3);
        cond.reduceSound(); // звук на -1

        int expected = 2;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound2() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(2);
        cond.reduceSound(); // звук на -1

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound1() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(1);
        cond.reduceSound(); // звук на -1

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundMin() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.reduceSound0(); // звук на -1

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSoundMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.reduceSound(); // звук на -1

        int expected = 9;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound9() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(9);
        cond.reduceSound(); // звук на -1

        int expected = 8;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseSound9() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(9);
        cond.increaseSound(); // звук на +1

        int expected = 10;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }
    @Test
    public void increaseSound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.increaseSound(); // звук на +1

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.increaseSound(); // звук на +1

        int expected = 10;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }


    }
