import java.util.Scanner;

public class NajvecjiSkupniDelitelj{

  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    Evklid(a,b)
  
  } 
  
  
  public static int Evklid(int a, int b){
        // Euclid's algorithm with recursion
        // it's neccessary that a >= b
        if (b == 0) { // Breakpoint of recursion
                return a;
        }
        else{
          return Evklid(b, a % b); // Recursion start
        }
    }
  
  
}
