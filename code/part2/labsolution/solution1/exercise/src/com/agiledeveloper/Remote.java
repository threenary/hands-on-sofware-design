package com.agiledeveloper;

public class Remote {
  private Device device;

  public Remote(Device theDevice) { device = theDevice; }

  public void up() {
    device.up();
  }

  public void down() {
    device.down();
  }
}