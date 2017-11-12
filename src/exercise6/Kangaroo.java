package exercise6;

import java.util.Objects;

/**
 *
 * Class Kangaroo
 * Create a class Kangaroo with the following data members: String name, integer age, and integer babies (1 by default).
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class Kangaroo {
    private String name;
    private int age;
    private int babies;

    public Kangaroo(String name, int age) {
        this.name = name;
        this.age = age;
        this.babies = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBabies() {
        return babies;
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "name=" + name + ", age=" + age + ", babies=" + babies + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.age;
        hash = 17 * hash + this.babies;
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
        final Kangaroo other = (Kangaroo) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.babies != other.babies) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}