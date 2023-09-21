package account;

public class Admin extends Account {
  Admin(String username, String password, int id) {
    super(username, password, id);
  }
  // constructor refering all variables to superclass constructor

  public String overviewMessage() {
    return ("I am an Admin " + "\n my ID is " + Integer.toString(this.getID()));
  }
  //returns rank and id
}