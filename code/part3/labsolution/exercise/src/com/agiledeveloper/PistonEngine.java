package com.agiledeveloper;

public class PistonEngine extends Engine {
  public PistonEngine() { super(); }
  protected PistonEngine(PistonEngine other) { super(other); }

  public Engine clone() {
    return new PistonEngine(this);
  }
}
