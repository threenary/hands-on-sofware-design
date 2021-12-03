package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import static exercise.Exercise.*;

public class ExerciseTest {
  @Test
  void checkCommaSeparatedNamesOfLength() {
    assertAll(
      () -> assertEquals("", commaSeparatedNamesOfLength(Arrays.asList(), 5)),
      () -> assertEquals("", commaSeparatedNamesOfLength(Arrays.asList("Tom"), 5)),
      () -> assertEquals("JERRY", commaSeparatedNamesOfLength(Arrays.asList("Tom", "Jerry"), 5)),
      () -> assertEquals("JERRY, SPIKE", commaSeparatedNamesOfLength(Arrays.asList("Tom", "Jerry", "Spike"), 5)),
      () -> assertEquals("JERRY, SPIKE, BUTCH", commaSeparatedNamesOfLength(Arrays.asList("Tom", "Jerry", "Spike", "Butch"), 5)));
  }

  @Test
  void checkCalculate() {
    assertAll(
      () -> assertEquals(0, calculate(Arrays.asList())),
      () -> assertEquals(0, calculate(Arrays.asList(1))),
      () -> assertEquals(0, calculate(Arrays.asList(1, 2))),
      () -> assertEquals(0, calculate(Arrays.asList(1, 2, 3))),
      () -> assertEquals(8.0, calculate(Arrays.asList(1, 2, 3, 4))),
      () -> assertEquals(8.0, calculate(Arrays.asList(1, 2, 3, 4, 5))),
      () -> assertEquals(20.0, calculate(Arrays.asList(1, 2, 3, 4, 5, 6))),
      () -> assertEquals(36.0, calculate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))),
      () -> assertEquals(36.0, calculate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10))),
      () -> assertEquals(36.0, calculate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12)))
    );
  }
}
