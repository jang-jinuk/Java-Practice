package lang.immutable.test;

public class ImmuableMyDate {

  private final int year;
  private final int month;
  private final int day;

  public ImmuableMyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public ImmuableMyDate withYear(int withYear) {
    return new ImmuableMyDate(withYear, month, day);
  }

  public ImmuableMyDate withMonth(int withMonth) {
    return new ImmuableMyDate(year, withMonth, day);
  }

  public ImmuableMyDate withDay(int withDay) {
    return new ImmuableMyDate(year, month, withDay);
  }

  @Override
  public String toString() {
    return year + "-" + month +  "-" + day;
  }
}
