package account;

public class Guest extends Account{
  public Guest(String username, String password, String rankID){
    this.username = username;
    this.password = password;
    this.rankID = rankID;
  }
  
  public void displayRank() {
    System.out.println("I'm a guest!");
  }
}
