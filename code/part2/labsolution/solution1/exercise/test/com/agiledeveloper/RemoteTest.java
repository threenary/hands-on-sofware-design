package com.agiledeveloper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoteTest {
  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void remoteIncreaseVolumeOfATV() {
    TV tv = new TV();
    Remote remote = RemoteFactory.createRemoteForTV(tv);

    int volume = tv.getVolume();
    remote.up();

    assertEquals(1, volume);
    assertEquals(2, tv.getVolume());
  }

  @Test
  void remoteDecreaseVolumeOfATV() {
    TV tv = new TV();
    Remote remote = RemoteFactory.createRemoteForTV(tv);

    int volume = tv.getVolume();
    remote.down();

    assertEquals(1, volume);
    assertEquals(0, tv.getVolume());
  }

  @Test
  void remoteIncreaseSpeedOfAFan() {
    Fan fan = new Fan();
    Remote remote = RemoteFactory.createRemoteForFan(fan);

    int speed = fan.getSpeed();
    remote.up();

    assertEquals(5, speed);
    assertEquals(6, fan.getSpeed());
  }

  @Test
  void remoteDecreaseSpeedOfAFan() {
    Fan fan = new Fan();
    Remote remote = RemoteFactory.createRemoteForFan(fan);

    int speed = fan.getSpeed();
    remote.down();

    assertEquals(5, speed);
    assertEquals(4, fan.getSpeed());
  }

  void remoteOpenGarage() {
    Garage garage = new Garage();
    Remote remote = RemoteFactory.createRemoteForGarage(garage);

    boolean open = garage.isOpen();
    remote.up();

    assertFalse(open);
    assertTrue(garage.isOpen());

    remote.down();
    assertFalse(garage.isOpen());
  }
}
