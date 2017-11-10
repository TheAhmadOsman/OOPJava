package quizzes;

/**
 * Class Date
 * @author yasiro01
 */
public class Date {
  private int day;
  private int month;
  private int year;

  public Date() {
    this.day = 9;
    this.month = 11;
    this.year = 2017;
  }
    
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 71 * hash + this.day;
    hash = 71 * hash + this.month;
    hash = 71 * hash + this.year;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Date other = (Date) obj;
    if (this.day != other.day) {
      return false;
    }
    if (this.month != other.month) {
      return false;
    }
    if (this.year != other.year) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("%d/%d/%d", day, month, year);
  }

}
