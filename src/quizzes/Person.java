package quizzes;

import java.util.Objects;

/**
 * Class Person
 * @author yasiro01
 */
public class Person {
  String name;
  Date dob;

  public Person() {
    this.name = "John Doe";
    this.dob = new Date();
  }
    
  public Person(String name, Date dob) {
    this.name = name;
    this.dob = dob;
  }

  public String getName() {
    return name;
  }

  public Date getDob() {
    return dob;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 11 * hash + Objects.hashCode(this.name);
    hash = 11 * hash + Objects.hashCode(this.dob);
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
    final Person other = (Person) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.dob, other.dob)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("%s was born on %s", name, dob);
  }
  
}