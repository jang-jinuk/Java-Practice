package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2024, 1, 1);
    for (int i = 1; i <= 5; i++) {
      // 내 코드
      System.out.println("날짜 " + i + ": " + startDate);
      startDate = startDate.plusWeeks(2);
    }

    for (int i = 0; i <= 5; i++) {
      // 강사님 코드
      LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
      System.out.println("날짜 " + (i + 1) + ": " + nextDate);
    }
  }
}
