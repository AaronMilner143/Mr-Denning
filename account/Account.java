package account;

public abstract class Account {
  private String username;
  private String password;
  private int id;
  // variables

  Account(String username, String password, int id) {
    this.username = username;
    this.password = password;
    this.id = id;
  }
  // constructor

  abstract String overviewMessage();
  // message displayed

  public void setUsername(String desiredUsername) {
    this.username = desiredUsername;
  }

  public void setPassword(String desiredPassword) {
    this.password = desiredPassword;
  }

  public void setID(int desiredID) {
    this.id = desiredID;
  }
  // setters

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public int getID() {
    return this.id;
  }
  // getters

}