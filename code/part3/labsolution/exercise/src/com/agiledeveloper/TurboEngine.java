package com.agiledeveloper;

public class TurboEngine extends Engine {
  public TurboEngine() { super(); }
  protected TurboEngine(TurboEngine other) { super(other); }

  public Engine clone() {
    return new TurboEngine(this);
  }
}
