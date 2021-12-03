package com.agiledeveloper;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
  @Test
  void canary() {
    assertTrue(true);
  }

  @Test
  void createCarWithATurboEngine() {
    Car car = new Car(1987, new TurboEngine());

    assertEquals(1987, car.getYear());
    assertEquals("TurboEngine", car.getEngine().getClass().getSimpleName());
  }

  @Test
  void createCarWithAPistonEngine() {
    Car car = new Car(1987, new PistonEngine());

    assertEquals(1987, car.getYear());
    assertEquals("PistonEngine", car.getEngine().getClass().getSimpleName());
  }

  @Test
  void copyCarWithATurboEngine() {
    Car car1 = new Car(1999, new TurboEngine());

    Car car2 = Car.copyCar(car1);

    assertEquals(1999, car1.getYear());
    assertEquals("TurboEngine", car1.getEngine().getClass().getSimpleName());

    assertEquals(1999, car2.getYear());
    assertEquals("TurboEngine", car2.getEngine().getClass().getSimpleName());
  }

  @Test
  void copyCarWithAPistonEngine() {
    Car car1 = new Car(1999, new PistonEngine());

    Car car2 = Car.copyCar(car1);

    assertEquals(1999, car1.getYear());
    assertEquals("PistonEngine", car1.getEngine().getClass().getSimpleName());

    assertEquals(1999, car2.getYear());
    assertEquals("PistonEngine", car2.getEngine().getClass().getSimpleName());
  }
}
