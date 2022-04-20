package ru.netology;

public class Radio100 {
  private int currentSound; // объект радио запоминает текущий уровень звука (только для нас - private, для других public)

  public int getCurrentSound() {  //метод для отдачи текущего звука
    return currentSound;
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

  public void increaseSound() { // увеличение звука на +1
    if (currentSound < 10) {
      currentSound = currentSound + 1;
    }
  }

  public void reduceSound() { // уменьшение звука на -1
    if (currentSound < 10) {
      currentSound = currentSound - 1;
    }
    if (currentSound < 11){
      currentSound = currentSound - 1;
    }
  }

  public void reduceSoundMin() { //если значение звука меньше 0
    if (currentSound < 0) {
      currentSound = 0;
    }
  }
    public void reduceSoundMax() { //если значение звука больше 10
      if (currentSound > 10) {
        currentSound = 10;
      }

    }
  }



