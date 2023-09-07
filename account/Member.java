package account;

public class Member extends Account {
  public Member(String username, String password, String rankID) {
    this.username = username;
    this.password = password;
    this.rankID = rankID;
  }

  public void displayRank() {
    System.out.println("I'm a member!");
  }
}