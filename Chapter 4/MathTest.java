public class MathTest
{
   public static void main(String[] args)
   {
      double angle = -1.57; // Example angle for sin and cos
      double number = 22.7; // Example number for floor and ceil
      int a = 71, b = 68;   // Numbers for max and min

      System.out.println("SQRT: " + Math.sqrt(37));
       System.out.println("sin: " + Math.sin(angle));
        System.out.println("cos: " + Math.cos(angle));
        System.out.println("floor: " + Math.floor(number));
        System.out.println("ceil: " + Math.ceil(number));
        System.out.println("round: " + Math.round(70));
        System.out.println("max: " + Math.max(a, b));
        System.out.println("min: " + Math.min(a, b));
        System.out.println("random: " + Math.random() * 100); // Random number up to 100
      
   }
}
