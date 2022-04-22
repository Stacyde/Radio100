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
    public void Sound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);

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
    public void Station_1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void Station10() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void Station1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

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
    public void increaseStation() {
        Radio100 cond = new Radio100();
        cond.increaseStation(); // звук на +1

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(1);
        cond.reduceStation(); // звук на -1

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation() {
        Radio100 cond = new Radio100();
        cond.reduceStation(); // звук на -1

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation0() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(0);
        cond.reduceStation(); // звук на -1

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation9() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(9);
        cond.reduceStation(); //  на -1


        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation5() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(5);
        cond.reduceStation(); //  на -1


        int expected = 4;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound() {
        Radio100 cond = new Radio100();
        cond.reduceSound(); // звук на -1

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound10() {
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
    public void reduceSound5() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(5);
        cond.reduceSound(); // звук на -1

        int expected = 4;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.reduceSound(); // звук на -1

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseStation9() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(9);
        cond.increaseStation(); // станция на +1

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void increaseStation8() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(8);
        cond.increaseStation(); // станция на +1

        int expected = 9;
        int actual = cond.getCurrentStation();

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

    @Test
    public void currentStation() {
        Radio100 cond = new Radio100(); //создай радио

        int expected = 0;
        int actual = cond.getCurrentStation(); //обращаемся к методу текущий станция

        assertEquals(expected, actual);

    }

    @Test
    public void minStation() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStation() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }




    @Test
    public void increaseStation0() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(0);
        cond.increaseStation(); // станция на +1

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }



    @Test
    public void StationMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void increaseSound10() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.increaseSound(); // звук на +1

        int expected = 10;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

}
