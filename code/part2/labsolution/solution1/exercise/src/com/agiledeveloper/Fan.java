package com.agiledeveloper;

public class Fan implements Device {
  private int speed = 5;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int value) {
    speed = value;
  }

  @Override
  public void up() {
    speed++;
  }

  @Override
  public void down() {
    speed--;
  }
}
