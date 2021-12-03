package com.agiledeveloper;

public class Garage {
  private boolean open;

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean state) {
    open = state;
  }

  public Remote getRemoteFor() {
    return new Remote() {
      @Override
      public void up() {
        open = true;
      }

      @Override
      public void down() {
        open = false;
      }
    };
  }
}
