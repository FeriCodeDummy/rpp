import java.util.Scanner;

public class drugo_najvecje_stevilo {
   public static void main(String [] args){
     int y=0, z=0, temp=0; // z is higherst value, y is second highest value, temp is a temporary value used for saving
     Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
                int x = scanner.nextInt(); // Get new value from user input
            if (x > y){ // if new value > second make it second
                temp = x;
                x = y;
                y = temp;
                if(y>z){ // if second value is higher than highest value, make it highest
                    temp = y;
                    y = z;
                    z = temp;
                }
            }
        }
     System.out.println(y); // print second highest value
    
   }
}
