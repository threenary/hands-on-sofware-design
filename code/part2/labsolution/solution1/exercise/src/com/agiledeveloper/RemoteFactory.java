package com.agiledeveloper;

public class RemoteFactory {
  public static Remote createRemoteForTV(TV tv) {
    return new Remote(tv);
  }

  public static Remote createRemoteForFan(Fan fan) {
    return new Remote(fan);
  }

  public static Remote createRemoteForGarage(Garage garage) {
    return new Remote(garage);
  }
}
