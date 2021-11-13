import java.util.Scanner;


public class koncentricni_kvadrat {

  public static void main(String[] args){
  
    Scanner scanner = new Scanner(System.in);
    s1 = Scanner.nextInt();
    s2 = Scanner.nextInt();
    s3 = Scanner.nextInt();
    
    int div1 = (s1-s2)/2 -1;
    int div2 = (s2-s3)/2 -1;
    int d1 = 0;
    int d2 = 0;
    System.out.println(repeat(s1, "X"));
    for (int i = 1; i<s1 - 1; i++){
        if (i > div1 && d1 < s2){

            if (i > 1 + div1 + div2 && d2 < s3){
                if (d2 == 0 ||d2 == s3 - 1 ){
                    System.out.println("X" + repeat(div1, " ") + "-" + repeat(div2, " ") + repeat(s3, "+")+ repeat(div2, " ") + "-" + repeat(div1, " ") + "X");
                }
                else if(i == (s1 - 1)/2){
                    System.out.println("X" + repeat(div1, " ") + "-" + repeat(div2, " ") + "+" + repeat((s3-3)/2, " ") + "0"+ repeat((s3-3)/2, " ") + "+" + repeat(div2, " ") + "-" + repeat(div1, " ") + "X");

                }

                else{System.out.println("X" + repeat(div1, " ") + "-" + repeat(div2, " ") + "+" + repeat(s3 - 2, " ")+ "+" + repeat(div2, " ") + "-" + repeat(div1, " ") + "X");
                }
                d2++;
            }

            else if (d1 == 0 ||d1 == s2 - 1){
                System.out.println("X" + repeat(div1, " ") + repeat(s2, "-") + repeat(div1, " ") + "X");

            }
            else{
            System.out.println("X" + repeat(div1, " ") + "-" +repeat(s2 - 2, " ") +"-" + repeat(div1, " ") + "x");
            }
            d1++;

        }else{
            System.out.println("X" + repeat(s1 - 2, " ") + "X");
        }

        }
    System.out.println(repeat(s1, "X"));

    }
    
  }
public static String repeat(int repeat, String s){

        return new String(new char[repeat]).replace("\0", s);
    }

}
