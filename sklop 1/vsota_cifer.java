import java.util.Scanner;


public class vsota_cifer{
  public static void main (String [] args){
      int vsota = 0;
      Scanner scanner = new Scanner(System.in); // Create user input reader
      int s = scanner.nextInt(); // Get input 
      while (s != 0) { // move for one place in left until value is zero
          vsota = vsota + s % 10;  // Add digit at place to sum
          s = s / 10; // divide s by 10
      }
      
      System.out.println(vsota); // Print sum
  }
  
}
