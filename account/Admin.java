package account;

public class Admin extends Account {
  public Admin(String username, String password, String rankID) {
    this.username = username;
    this.password = password;
    this.rankID = rankID;
    
  }

  public void displayRank()
  {
    System.out.println("I'm " + this.username + "I'm a Admin!");
  }
}
