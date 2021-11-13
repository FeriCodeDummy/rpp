import java.util.Scanner;

public class plasc_kocke{

  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextInt();
    System.out.print("*" + repeat(s-2, " ") + "*" + repeat(s-2, "\n"));
    for (int j = 0; j < 2; j++){
        System.out.println(repeat(4, "*" + repeat(s-2, " ")) + "*" + repeat(s-3, "\n"));
      }
    System.out.print(repeat(s * 3 - 3 , " ") + "*" + repeat(s-2, " ") + "*");

  }
  
    public static String repeat(int repeat, String s){
        return new String(new char[repeat]).replace("\0", s);
    }

}
