import account.*;
import java.util.Scanner;
import java.util.Random;

public class Server {
  public String accountList[];
  public void serverMenu(){
    Scanner scr1 = new Scanner(System.in); //Scanners will be labeled numerically 
    
    //Introduction and Main Route Menu
    System.out.println("Hello, welcome to the server, how can I help you?\nType the # of the menu you'd like to advance to.\n1. Create an account\n2. View accounts\n3. Exit Program");

    //mem = menu error message
    //mem1 = no such option 
    String mem1 = ("Invalid Response, please enter the # corrisponding the Menu You would like to advance to.");

    try {
      //try catch for trying to parse string as int
      int userInput = Integer.parseInt(scr1.nextLine());
    
      if (userInput == 1){
        this.accCreation();
      }
      else if (userInput == 2){
        this.accView();
      }
      else if (userInput == 3){
        this.endProgram();
      }
      else{
        System.out.println(mem1);
        this.serverMenu();
      } 
    } catch(NumberFormatException e) {
      System.out.println(mem1);
      this.serverMenu();
    }
  //end serverMenu
  }

  private void accCreation() {
    Scanner scr2 = new Scanner(System.in);
    Random numberIDGen = new Random();

    String mem2 = "Error, something went wrong during your account creation. Please retry.";
    try{
      //Username
      System.out.println("Name for new Account: ");
      String userName = scr2.nextLine();

      //Password
      System.out.println("Password for new Account: ");
      String password = scr2.nextLine();
    
    
      //Account Type
      System.out.println("Type the corresponding # to choose the account permission level \n 1. guest \n 2. member \n 3. Admin");

    int choice = Integer.parseInt(scr2.nextLine());      
      if (choice == 1) {
        //Guest Acc
        String guestID = ("g" + numberIDGen.nextInt(99999));

        Guest newGuest = new Guest(userName, password, guestID);
        newGuest.accDeatails();
      }
      else if(choice == 2) {
        //Member Acc
        String memberID = ("m" + numberIDGen.nextInt(99999));
        accountList.(username);
      }
      else if(choice == 3){
        //Admin Acc
        String adminID = ("a" + numberIDGen.nextInt(99999));
        
      }
    }catch (Exception e) {
      System.out.println(mem2);
      accCreation();
    }
    // end accCreation
    serverMenu();
  }

  private void accView() {
    System.out.println("type the name of the account you would like to view");
    String acc = scr1.nextLine();
    if()
  }

  private void endProgram() {
    System.out.println("Have a nice day!");
    // end endProgram
  }

}