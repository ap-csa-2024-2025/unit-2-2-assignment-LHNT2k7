import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println("Hello");
    Scanner sc = new Scanner (System.in);
    System.out.println("What did you want to buy?");
      String Item = sc.nextLine();
    
    System.out.println("How many did you want to buy?");
     int quantity = sc.nextInt();
    
    System.out.println("How much does each one weight?");
     double weigh = sc.nextDouble();
    
    System.out.println(quantity +  Item + " at " + weigh + " pounds each will weight " + (quantity * weigh) + " pounds total");
    
  }
}
