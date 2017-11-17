package notes;

/**
 *
 * @author yasiro01
 */
public class PersonFaculty extends Person {
  private static String officeBuilding = "Olin";
  private final int officeRoom;

  public PersonFaculty(int officeRoom) {
    this.officeRoom = officeRoom;
  }

  public PersonFaculty(int officeRoom, String name, String race, int age) {
    super(name, race, age);
    this.officeRoom = officeRoom;
  }
  
  public String getPersonalInfo() {
    return this.name + " " + this.race;
  }
  
  public void move(String newBuilding) {
    officeBuilding = newBuilding;
  }
  
  @Override
  public String toString() {
    return super.toString() + " resides in " + officeBuilding + officeRoom;
  }
  
}
