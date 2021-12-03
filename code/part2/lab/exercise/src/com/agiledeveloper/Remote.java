package com.agiledeveloper;

public class Remote {
  private TV tv;
  private Fan fan;
  private Garage garage;

  public Remote(TV theTV) {
    tv = theTV;
  }

  public Remote(Fan theFan) { fan = theFan; }

  public Remote(Garage theGarage) { garage = theGarage; }

  public void up() {
    if(tv != null) {
      tv.setVolume(tv.getVolume() + 1);
    }

    if(fan != null) {
      fan.setSpeed(fan.getSpeed() + 1);
    }

    if(garage != null) {
      garage.setOpen(true);
    }
  }

  public void down() {
    if(tv != null) {
      tv.setVolume(tv.getVolume() - 1);
    }

    if(fan != null) {
      fan.setSpeed(fan.getSpeed() - 1);
    }

    if(garage != null) {
      garage.setOpen(false);
    }
  }
}