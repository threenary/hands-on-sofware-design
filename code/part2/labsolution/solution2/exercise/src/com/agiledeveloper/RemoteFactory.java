package com.agiledeveloper;

public class RemoteFactory {
  public static Remote createRemoteForTV(TV tv) {
    return tv.getRemote();
  }

  public static Remote createRemoteForFan(Fan fan) {
    return fan.getRemote();
  }

  public static Remote createRemoteForGarage(Garage garage) {
    return garage.getRemoteFor();
  }
}
