package com.agiledeveloper;

public class Garage implements Device {
  private boolean open;

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean state) {
    open = state;
  }

  @Override
  public void up() {
    open = true;
  }

  @Override
  public void down() {
    open = false;
  }
}
