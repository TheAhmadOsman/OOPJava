package notes;

/**
 * @author yasiro01
 */
public class PersonCheck {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
//    System.out.println("Person");
//    Person p = new Person();
//    System.out.println(p);
//    
//    System.out.println("Faculty");
//    PersonFaculty pf = new PersonFaculty("Olin", 202);
//    System.out.println(pf);
//    String personalInfo = pf.getPersonalInfo();
//    System.out.println(personalInfo);
//    
//    System.out.println("Another faculty");
//    PersonFaculty apf = new PersonFaculty("Koren", 120, "Alice", "white", 57);
//    System.out.println(apf);

    System.out.println("Static");
    PersonFaculty f1 = new PersonFaculty(321, "Alice", "black", 55);
    PersonFaculty f2 = new PersonFaculty(202, "Bob", "white", 45);
    System.out.println(f1);
    f2.move("Preuss");
    System.out.println(f1);
  }
  
}
