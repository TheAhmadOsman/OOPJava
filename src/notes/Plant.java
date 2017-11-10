package notes;

import java.util.Objects;

/**
 * Class Plant
 * @author yasiro01
 */
public class Plant {
  private final boolean flowering;
  private final boolean edible;
  private final String species;
  private int height = 0;

  public Plant() {
    this.flowering = false;
    this.edible = false;
    this.species = "Whatever";
  }
  
  public Plant(boolean flowering, boolean edible, String species) {
    this.flowering = flowering;
    this.edible = edible;
    this.species = species;
  }
  
  public Plant(boolean flowering, boolean edible, String species, int height) {
    this.flowering = flowering;
    this.edible = edible;
    this.species = species;
    this.height = height;
  }  

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public boolean isFlowering() {
    return flowering;
  }

  public boolean isEdible() {
    return edible;
  }

  public String getSpecies() {
    return species;
  }

  @Override
  public String toString() {
    return "Plant{" + "flowering=" + flowering + ", edible=" + edible + ", species=" + species + ", height=" + height + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + (this.flowering ? 1 : 0);
    hash = 59 * hash + (this.edible ? 1 : 0);
    hash = 59 * hash + Objects.hashCode(this.species);
    hash = 59 * hash + this.height;
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
    final Plant other = (Plant) obj;
    if (this.flowering != other.flowering) {
      return false;
    }
    if (this.height != other.height) {
      return false;
    }
    if (!Objects.equals(this.species, other.species)) {
      return false;
    }
    return true;
  }
  
  
}
