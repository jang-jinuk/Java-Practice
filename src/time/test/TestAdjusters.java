package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
  public static void main(String[] args) {
    int year = 2024;
    int month = 1;

    LocalDate dt = LocalDate.of(year, month, 1);

    DayOfWeek firstDayofWeek = dt.getDayOfWeek();
    DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

    System.out.println("firstDayOfWeek = " + firstDayofWeek);
    System.out.println("lastDayOfWeek = " + lastDayOfWeek);
  }
}
