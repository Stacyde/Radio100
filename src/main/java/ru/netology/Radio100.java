package ru.netology;

public class Radio100 {

    private int currentSound = 0;
    private int currentStation = 0;
    private int maxSound = 100;
    private int minSound = 0;
    private int maxStation = 9;
    private int minStation = 0;

    public Radio100 (){
    }

    public Radio100(int currentSound, int currentStation, int maxSound, int minSound, int maxStation, int minStation) {
        this.currentSound = currentSound;
        this.currentStation = currentStation;
        this.maxSound = maxSound;
        this.minSound = minSound;
        this.maxStation = maxStation;
        this.minStation = minStation;
    }

    public int getCurrentSound() {return currentSound;}


    public int getCurrentStation() {return currentStation;}

    public int getMaxSound() { return maxSound; }

    public void setMaxSound(int maxSound){this.maxSound = maxSound;}

    public int getMaxStation() {return maxStation;}

    public void setMaxStation(int maxStation){this.maxStation = maxStation;}

    public int getMinSound() {return minSound;}

    public void setMinSound(int minSound){this.minSound = minSound;}

    public int getMinStation() {return minStation;}

    public void setMinStation(int minStation){this.minStation = minStation;}

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound > 100) {
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
        if (currentSound < 100) {
            currentSound = currentSound + 1;
        } else {
            currentSound = 100;
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
            currentStation = 10;
        } else {
            currentStation = currentStation - 1;

        }
    }


}








