package com.agiledeveloper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {
  @Test
  void canary() {
    assertTrue(true);
  }
  
  @Test
  void greet() {
    assertEquals("hello", Util.greet());    
  }
}
