import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    Scanner scanner = new Scanner(System.in);
    AccountDatabase accountDatabase = new AccountDatabase(scanner);
    accountDatabase.databaseMenu();
  }
}