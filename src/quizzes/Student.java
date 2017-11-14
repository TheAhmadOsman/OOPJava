package quizzes;

import java.util.Objects;

/**
 * Class Student
 * @author yasiro01
 */
public class Student {
  private static int idCount = 0;
  private final int id;
  private String firstName;
  private String lastName;
  private String major;
  private Date expGraduation;

  public Student(String firstName, String lastName, String major, Date expGraduation) {
    this.id = ++idCount;
    this.firstName = firstName;
    this.lastName = lastName;
    this.major = major;
    this.expGraduation = expGraduation;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId() {
    return id;
  }

  /**
   * Get the value of firstName
   * @return the value of firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set the value of firstName
   * @param firstName new value of firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Get the value of lastName
   * @return the value of lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set the value of lastName
   * @param lastName new value of lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Get the value of major
   * @return the value of major
   */
  public String getMajor() {
    return major;
  }

  /**
   * Set the value of major
   * @param major new value of major
   */
  public void setMajor(String major) {
    this.major = major;
  }

  /**
   * Get the value of expGraduation
   * @return the value of expGraduation
   */
  public Date getExpGraduation() {
    return expGraduation;
  }

  /**
   * Set the value of expGraduation
   * @param expGraduation new value of expGraduation
   */
  public void setExpGraduation(Date expGraduation) {
    this.expGraduation = expGraduation;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 47 * hash + this.id;
    hash = 47 * hash + Objects.hashCode(this.expGraduation);
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
    final Student other = (Student) obj;
    return this.id == other.id;
  }

  @Override
  public String toString() {
    return String.format("%d | %s, %s | %s | %s", id, lastName, firstName,  major, expGraduation.toString());
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }
  
}
