package ru.netology;

public class Radio100 {

    private int currentSound = 0;
    private int currentStation = 0;
    private int maxSound = 100;
    private int minSound = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int numberStation = 10;
    private int numberSound = 101;

    public Radio100() {
    }

    public Radio100(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getNumberSound() {
        return numberSound;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 10) {
        }
        if (newNumberStation >= numberStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void setNumberSound(int newNumberSound) {
        if (newNumberSound < 0) {
            return;
        }
        if (newNumberSound > 101) {
        }
        if (newNumberSound >= numberSound) {
            return;
        }
        numberSound = newNumberSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxSound(int newMaxSound) {
        if (newMaxSound > maxSound) {
            return;
        }
        this.maxSound = maxSound;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int newMaxStation) {
        if (newMaxStation > maxStation) {
            return;
        }
        this.maxStation = maxStation;
    }

    public int getMinSound() {
        return minSound;
    }

    public void setMinSound(int newMinSound) {
        if (newMinSound < minSound) {
            return;
        }
        this.minSound = minSound;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int newMinStation) {
        if (newMinStation > minStation) {
            return;
        }
        this.minStation = minStation;
    }

    public void setCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            return;
        }
        if (newCurrentSound >= 100) {
        }
        if (newCurrentSound >= numberSound) {
            return;
        }
        currentSound = newCurrentSound;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
        }
        if (newCurrentStation >= numberStation) {
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











