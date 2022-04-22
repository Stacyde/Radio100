package ru.netology;

public class Radio100 {
  private int currentSound; // объект радио запоминает текущий уровень звука (только для нас - private, для других public)
  private int currentStation;

  public int getCurrentSound() {  //метод для отдачи текущего звука
    return currentSound;
  }

  public int getCurrentStation() { //метод для отдачи текущий станции
    return currentStation;
  }

  public void setCurrentSound(int newCurrentSound) { // принимает значение от 0 до 10
    if (newCurrentSound < 0) {
      return;
    }
    if (newCurrentSound > 10) {
      return;
    }
    currentSound = newCurrentSound;
  }

  public void setCurrentStation(int newCurrentStation) { // принимает значение от 0 до 9
    if (newCurrentStation < 0) {
      return;
    }
    if (newCurrentStation > 9) {
      return;
    }
    currentStation = newCurrentStation;
  }

  public void increaseSound() {  //+1 sound
    if (currentSound < 10) {
      currentSound = currentSound + 1;
    } else {
      currentSound = 10;
    }
  }

  public void increaseStation() {  //  на +1 станцию
    if (currentStation < 9) {
      currentStation = currentStation + 1;
    } else {
      currentStation = 0;
    }
  }

  public void reduceSound() { //  звук на -1
    if (currentSound <= 0) {
      currentSound = 0;
    } else {

        currentSound = currentSound - 1;
      }
  }

  public void reduceStation() { //  станции на -1
    if (currentStation <= 0) {
      currentStation = 9;
    } else {
        currentStation = currentStation - 1;

      }
    }


  }








