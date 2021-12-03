package com.agiledeveloper;

public class Car {
  private final int year; //please keep this final
  private final Engine engine; //please keep this final

  public Car(int theYear, Engine theEngine) {
    year = theYear;
    engine = theEngine;
  }

  public Car(Car other) {
    year = other.year;

    if(other.engine instanceof TurboEngine) {
      engine = new TurboEngine((TurboEngine)(other.getEngine()));
    } else {
      engine = new PistonEngine((PistonEngine) (other.getEngine()));
    }
  }

  public static Car copyCar(Car car) {
    return new Car(car);
  }

  public int getYear() { return year; }
  public Engine getEngine() { return engine; }
}