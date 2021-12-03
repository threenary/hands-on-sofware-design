package com.agiledeveloper;

public class Car {
  private final int year; //please keep this final
  private final Engine engine; //please keep this final

  public Car(int theYear, Engine theEngine) {
    year = theYear;
    engine = theEngine;
  }

  protected Car(Car other) {
    year = other.year;

    //This violates OCP
//    if(other.engine instanceof TurboEngine) {
//      engine = new TurboEngine((TurboEngine)(other.getEngine()));
//    } else {
//      engine = new PistonEngine((PistonEngine) (other.getEngine()));
//    }

    //The first thought, why not use the clone feature in Java
    //Effective Java says, don't use clone, use the copy constructor!
    //clone can't deal with final fields whereas a copy constructor can.

    //Buy, the above code show that using copy constructor violates OCP

    //What gives?

    //The clone in Java has a limitation, but why not use our own clone?
    //Can our clone really modify a final field? Well, no, but we can use a double dispatching mechanism.
    //Our clone can turn and call a protected copy constructor.

    engine = other.engine.clone();
  }

  public Car clone() {
    return new Car(this);
  }

  public static Car copyCar(Car car) {
    return car.clone();
  }

  public int getYear() { return year; }
  public Engine getEngine() { return engine; }
}