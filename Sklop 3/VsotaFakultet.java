import java.util.Scanner;

public class VsotaFakultet{

  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in)
    int n = scanner.nextInt();
    System.out.println(vsotaFakultet(n))
    
  }
   public static int vsotaFakultet(int N){
        int n = 0;
        for (int i=1; i <= N; i++){
            n = n + Fakulteta(1, i, 1);
        }

        return n;
    }

    public static int Fakulteta(int N, int max, int curr){
        /* 
        // Solution without recursion
        int f = 1;
        for (int i =1; i<=N; i++){
            f = f * i;
        }
        return f
        */
         if (max == N){

             return curr*max;
         }
         else {
             return Fakulteta(N+1, max, curr*N);
         }


    }
  
}
