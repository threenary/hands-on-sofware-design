package com.agiledeveloper;

abstract public class Engine {
  public Engine() {}
  protected Engine(Engine other) {}

  public abstract Engine clone();
  //One downside to this solution is the clone is repeated in each of the derived classes.
  //DRY
  //One way to address that is to use reflection the Engine's clone method to get the copy constructor
  //using getDeclaredConstructor and then invoke it.
}
