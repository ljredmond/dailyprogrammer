package com.ljredmond.dailyprogrammer.solutions.easy.c375;

public class AddOneEachDigit {

  public long apply(long num) {
    if (num == 0L) return 1;

    long result = 0L;
    long place = 1L;

    while (num > 0) {
      int newDigit = ((int) (num % 10L)) + 1;

      result += place * newDigit;

      num /= 10L;
      place *= (newDigit == 10 ? 100L : 10L);
    }

    return result;
  }
}
