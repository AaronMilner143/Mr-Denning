package account;

public class Guest extends Account {
  Guest(String username, String password, int id) {
    super(username, password, id);
  }
  // constructor refering all variables to superclass constructor

  public String overviewMessage() {
    return ("I am a Guest " + "\n my ID is " + Integer.toString(this.getID()));
  }
  //says rank and id

}