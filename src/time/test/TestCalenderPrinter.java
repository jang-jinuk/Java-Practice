package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalenderPrinter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();
    LocalDate inputDate = LocalDate.of(year, month, 1);

    DayOfWeek firstDayOfWeek = inputDate.getDayOfWeek();
    int lastDayOfMonth = inputDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();

    int depth = 0;

    switch (firstDayOfWeek) {
      case MONDAY: depth = 1;
      break;
      case TUESDAY: depth = 2;
      break;
      case WEDNESDAY: depth = 3;
      break;
      case THURSDAY: depth = 4;
      break;
      case FRIDAY: depth = 5;
    }

    System.out.println("Su Mo Tu We Th Fr Sa");

    for (int j = 0; j < depth; j++) {
      System.out.print("   ");
    }

    int count = depth;

    for (int i = 1; i <= lastDayOfMonth; i++) {

      if (count == 7) { //줄 바꿈
        System.out.println();
        count = 0;
      }

      if (i < 10) {
        System.out.print(" " + i + " "); // 1자리수인 경우
      } else {
        System.out.print(i + " "); // 2자리수인 경우
      }

      count++;
    }
  }
}
