import java.util.Scanner;

public class Metulj{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int v = scanner.nextInt();
    String s = scanner.next();
    metulj(v,s)
  }
  
  public static String repeat(int times, String s){
     return new String(new char[times]).replace("\0", s);
  }
  
  public static void metulj(int visina, String symbol){
        for (int i=0; i < visina; i++){
            lineprinter((visina - i)* 2 - 2, symbol, i+1);
        }
        for (int i = visina -1; i > -1; i--){
            lineprinter((visina - i)*2, symbol, i);
        }

    }
  public static void lineprinter(int spaces, String symbol, int symbols){ // I know it's a little bit unreadable but oh well
        System.out.println(repeat(symbols, symbol) + repeat(spaces, " ") + repeat(symbols ,symbol));
    }
  
}
