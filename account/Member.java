package account;

public class Member extends Account {
  Member(String username, String password, int id) {
    super(username, password, id);
  }

  // constructor refering all variables to superclass constructor
  public String overviewMessage() {
    return ("I am a Member " + "\n my ID is " + Integer.toString(this.getID()));
  }
  //says rank and id

}