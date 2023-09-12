package account;

//Account newAccount = new Admin();
public abstract class Account {
  public String username;
  protected String password;
  protected String rankID;

  public abstract void displayRank();

  public void accDeatails() {
    System.out.println("User: " + username + "\tPassword: " + password + "\tRank " + rankID);
  }
}
