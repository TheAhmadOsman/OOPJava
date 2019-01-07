package exercise6;

import java.util.Objects;

/**
 * 
 * Class Owl
 * Create a class Owl with the following data members: String name, integer age, and String wisdom ("medium" by default).
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class Owl {
    private String name;
    private int age;
    private String wisdom;

    public Owl(String name, int age) {
        this.name = name;
        this.age = age;
        this.wisdom = "medium";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWisdom() {
        return wisdom;
    }

    @Override
    public String toString() {
        return "Owl{" + "name=" + name + ", age=" + age + ", wisdom=" + wisdom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.age;
        hash = 17 * hash + Objects.hashCode(this.wisdom);
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
        final Owl other = (Owl) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.wisdom, other.wisdom)) {
            return false;
        }
        return true;
    }
}