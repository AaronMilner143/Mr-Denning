import account.*;
import java.util.Scanner;//import scanners for getting user input
import java.util.ArrayList;//import arraylist for putting accounts into

public class AccountDatabase {
  private Scanner databaseScanner;
  //leave open to get scanner from outside class
  private ArrayList<Account> accounts = new ArrayList<Account>();
  //creates the arraylist that stores all accounts
  
  AccountDatabase(Scanner scanner) {
    this.databaseScanner = scanner;
  }
  //constructor
  
  public void createAccount() {
    Account newAccount;
    String newAccUsername;
    String newAccPassword;
    int newAccID;
    //all instance variables used

    System.out.println("Enter Username for account");
    newAccUsername = databaseScanner.next();
    if(preventUsernameDuplicates(newAccUsername)){
      System.out.println("Enter password");
      newAccPassword = databaseScanner.next();
      newAccID = accounts.size()+1;
      //create password and generate id 

      System.out.println("Type corresponding number to desired permission level");
      System.out.println("1. Guest");
      System.out.println("2. Member");
      System.out.println("3. Admin");
      String permissionChoice = databaseScanner.next();
      if(permissionChoice.equals("1")) {
        newAccount = new Guest(newAccUsername,newAccPassword,newAccID);
        accounts.add(newAccount);
      }
      else if(permissionChoice.equals("2")){
        newAccount = new Member(newAccUsername,newAccPassword,newAccID);
        accounts.add(newAccount);
      }
      else if(permissionChoice.equals("3")){
        newAccount = new Admin(newAccUsername,newAccPassword,newAccID);
        accounts.add(newAccount);
      }
      else {
        System.out.println("invalid choice");
        this.createAccount();
      }
      //set account permissions
      //likely need to put all of this into a loop that will execute just this segment of code when an invalid choice is made, rather than restarting whole process for ease of use
    }
    else {
      System.out.println("user already exists");
      this.createAccount();
    }
  }
  //add account to database

  
  public boolean preventUsernameDuplicates(String potentialEntry) {
    for(int i = 0; i < accounts.size(); i++) {
      if((accounts.get(i).getUsername()).equals(potentialEntry)) {
        return false;
      }
    }
    return true;
  }
  //checks whether a string already exists as a username for an account in the accounts arraylist

  public void viewAccount(){
    System.out.println("Enter username of account you'd like to view");
    String accountNameRequested = databaseScanner.next();
    
    for(int i = 0; i < accounts.size(); i++) {
      if((accounts.get(i).getUsername()).equals(accountNameRequested)) {
        System.out.println(accounts.get(i).overviewMessage());
        return;
      }
    }
    System.out.println("Username does not exist");
    return;
    //searches for account with username corresponding to the username that the user requested
  }
  public void databaseMenu() {
    System.out.println("Type number corresponding to desired choice");
    System.out.println("1. Create Account");
    System.out.println("2. View Account");
    System.out.println("3. Exit program");
    String databaseChoice = databaseScanner.next();
    if(databaseChoice.equals("1")){
      this.createAccount();
      this.databaseMenu();
    }
    else if(databaseChoice.equals("2")){
      this.viewAccount();
      this.databaseMenu();
    }
    else if(databaseChoice.equals("3")){
      System.exit(0);
    }
    else {
      System.out.println("invalid choice");
      this.databaseMenu();
    }
  }
}