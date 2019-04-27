package com.ljredmond.dailyprogrammer.solutions.easy.c375;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddOneEachDigitTest {

  private AddOneEachDigit addOneEachDigit = new AddOneEachDigit();

  @Test
  public void shouldWorkOnExampleFromReddit() {
    assertEquals(10109L, addOneEachDigit.apply(998));
  }

  @Test
  public void shouldWorkOnSingleDigitNumbers() {
    assertEquals(2L, addOneEachDigit.apply(1L));
    assertEquals(5L, addOneEachDigit.apply(4L));
    assertEquals(1L, addOneEachDigit.apply(0L));
    assertEquals(10L, addOneEachDigit.apply(9L));
  }

  @Test
  public void shouldWorkOnAllNines() {
    assertEquals(10L, addOneEachDigit.apply(9L));
    assertEquals(1010L, addOneEachDigit.apply(99L));
    assertEquals(101010L, addOneEachDigit.apply(999L));
    assertEquals(10101010L, addOneEachDigit.apply(9999L));
  }

  @Test
  public void shouldWorkOnBigNumbers() {
    assertEquals(3456789102345678910L, addOneEachDigit.apply(23456789123456789L));
  }
}