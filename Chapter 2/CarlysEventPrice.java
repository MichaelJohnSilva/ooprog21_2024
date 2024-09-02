import java.util.Scanner;

public class CarlysEventPrice
{
   public static void main(String[] args)
   {
      final int PRICE_PER_PERSON = 35;
      final int LARGE_EVENT_GUEST = 50;
      
      Scanner s = new Scanner(System.in);
   
      System.out.println("*************************************");
      System.out.println("* Carly's makes the food that makes * \n*             it a party.           *");
      System.out.println("*************************************");

      System.out.print("Enter the number of guest: ");
      int numberOfGuest = s.nextInt();
      
      int totalPriceOfGuest = numberOfGuest * PRICE_PER_PERSON;
      
      boolean isLargeEvent;
      if(numberOfGuest >= LARGE_EVENT_GUEST){
         isLargeEvent = true;
      }else {
         isLargeEvent = false;
      }
      
      System.out.println("Number of Guest: " + numberOfGuest);
      System.out.println("Price per Guest: $" + PRICE_PER_PERSON);
      System.out.println("Total Price: $" + totalPriceOfGuest);
      System.out.println("Is this a Large Event?: " + isLargeEvent); 
   }
}