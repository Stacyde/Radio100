package ru.netology;

public class Radio100 {
    private int currentSound;
    private int currentStation;

    public int getCurrentSound() {
        return currentSound;
    }

    public int getCurrentStation() { //метод для отдачи текущий станции
        return currentStation;
    }

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound > 10) {
            return;
        }
        currentSound = newCurrentSound;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseSound() {
        if (currentSound < 10) {
            currentSound = currentSound + 1;
        } else {
            currentSound = 10;
        }
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void reduceSound() {
        if (currentSound <= 0) {
            currentSound = 0;
        } else {

            currentSound = currentSound - 1;
        }
    }

    public void reduceStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;

        }
    }


}








