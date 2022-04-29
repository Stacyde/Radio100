package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Radio100Test {
    @Test
    public void shouldInitFieldsNumberStation(){
        Radio100 radio100 = new Radio100();
        assertEquals(10,radio100.getNumberStation());
    }

    @Test
    public void numberStation5() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(5);

        int expected = 5;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberStation_1() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(-1);

        int expected = 10;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }
    @Test
    public void numberStation7() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(7);

        int expected = 7;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberStation15() {
        Radio100 cond = new Radio100(20);
        cond.setNumberStation(15);

        int expected = 15;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void numberStation0() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(0);

        int expected = 0;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }
    @Test
    public void maxSound100() {
        Radio100 cond = new Radio100();
        cond.setMaxSound(100);

        int expected = 100;
        int actual = cond.getMaxSound();

        assertEquals(expected, actual);
    }
    @Test
    public void minSound0() {
        Radio100 cond = new Radio100();
        cond.setMinSound(0);

        int expected = 0;
        int actual = cond.getMinSound();

        assertEquals(expected, actual);
    }
    @Test
    public void minStation0() {
        Radio100 cond = new Radio100();
        cond.setMinStation(0);

        int expected = 0;
        int actual = cond.getMinStation();

        assertEquals(expected, actual);
    }
    @Test
    public void maxStation9() {
        Radio100 cond = new Radio100();
        cond.setMaxStation(9);

        int expected = 9;
        int actual = cond.getMaxStation();

        assertEquals(expected, actual);
    }
    @Test
    public void numberStation3() {
        Radio100 cond = new Radio100(3);
        int expected = 3;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }
    @Test
    public void numberStation20() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(15);


        int expected = 15;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }


    @Test
    public void numberStation10() {
        Radio100 cond = new Radio100();
        cond.setNumberStation(10);

        int expected = 10;
        int actual = cond.getNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInitFieldsMaxSound(){
        Radio100 radio100 = new Radio100();
        assertEquals(100, radio100.getMaxSound());

        Radio100 radio1001 = new Radio100();
        assertEquals(100, radio1001.getMaxSound());
    }
    @Test
    public void shouldInitFieldsMaxStation(){
        Radio100 radio100 = new Radio100();
        assertEquals(9, radio100.getMaxStation());
    }
    @Test
    public void shouldInitFieldsMinSound(){
        Radio100 radio100 = new Radio100();
        assertEquals(0, radio100.getMinSound());
    }
    @Test
    public void shouldInitFieldsMinStation(){
        Radio100 radio100 = new Radio100();
        assertEquals(0, radio100.getMinStation());
    }
    @Test
    public void shouldInitFields(){
        Radio100 radio100 = new Radio100();
        assertEquals(100, radio100.getMaxSound());
    }

    @Test
    public void currentSound() {
        Radio100 cond = new Radio100();

        int expected = 0;
        int actual = cond.getCurrentSound();

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
    public void sound101() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(101);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }
    @Test
    public void sound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void sound_1() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(-1);

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }
    @Test
    public void station_1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void station10() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void station1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSound() {
        Radio100 cond = new Radio100();
        cond.increaseSound();

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseStation() {
        Radio100 cond = new Radio100();
        cond.increaseStation();

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation1() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(1);
        cond.reduceStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation() {
        Radio100 cond = new Radio100();
        cond.reduceStation();

        int expected = 10;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation0() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(0);
        cond.reduceStation();

        int expected = 10;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation9() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(9);
        cond.reduceStation();


        int expected = 8;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceStation5() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(5);
        cond.reduceStation();


        int expected = 4;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound() {
        Radio100 cond = new Radio100();
        cond.reduceSound();

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void reduceSound10() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(10);
        cond.reduceSound();

        int expected = 9;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound9() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(9);
        cond.reduceSound();

        int expected = 8;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound5() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(5);
        cond.reduceSound();

        int expected = 4;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }
    @Test
    public void reduceSound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.reduceSound();

        int expected = 0;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void increaseStation9() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(9);
        cond.increaseStation();

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void increaseStation8() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(8);
        cond.increaseStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSound0() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(0);
        cond.increaseSound();

        int expected = 1;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(100);
        cond.increaseSound();

        int expected = 100;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);

    }

    @Test
    public void currentStation() {
        Radio100 cond = new Radio100();

        int expected = 0;
        int actual = cond.getCurrentStation();

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
        cond.increaseStation();

        int expected = 1;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void stationMax() {
        Radio100 cond = new Radio100();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void increaseSound100() {
        Radio100 cond = new Radio100();
        cond.setCurrentSound(100);
        cond.increaseSound();

        int expected = 100;
        int actual = cond.getCurrentSound();

        assertEquals(expected, actual);
    }

}
