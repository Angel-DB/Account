import java.util.Scanner;

public class AccountTest
{
  public static void main(String[] args)
  {
  
    Scanner input = new Scanner(System.in);
  
    Account myAccount = new Account();
  
    System.out.printf("Valor inicial de name: %s%n", myAccount.getName());
  
    System.out.print("Ingrese el nombre: ");
    String theName = input.nextLine();
    myAccount.setName(theName);
    System.out.println();
  
    System.out.printf("Name en objeto myAccount es: %n%s%n", 
                      myAccount.getName());
  }
}
