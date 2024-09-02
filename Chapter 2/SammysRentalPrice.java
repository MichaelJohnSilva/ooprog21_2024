import java.util.Scanner;

public class SammysRentalPrice
{
   public static void main(String[] args)
   {
      final int COST_PER_HOUR = 40;
      final int COST_PER_MINUTE = 1;
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S Sammy's make it fun in the sun. S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.print("\n");
      
      System.out.print("Enter the number of minutes rented: ");
      int totalMinutes = s.nextInt();
      
      int hours = totalMinutes / 60;
      int minutes = totalMinutes % 60;
      
      int totalPrice = (hours * COST_PER_HOUR) + (minutes * COST_PER_MINUTE);
      
      System.out.println("Hours rented: " + hours);
      System.out.println("Minutes rented: " + minutes);
      System.out.println("Total price: $" + totalPrice);
   }
}