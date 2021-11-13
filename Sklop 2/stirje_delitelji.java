import java.util.Scanner;

public class stirje_delitelji {

  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  
        
       for (int i = 1; i<=n; i++){
            if (hasDivisors(i) == 4){
                System.out.println(i);
            }
        }
  }
  
   private static int hasDivisors(int n) {
        int d = 0;
        for (int i = 1; i<=n;i++){
            if (n % i == 0){
                d++;
            }
        }
        return d;
    }
  
}
