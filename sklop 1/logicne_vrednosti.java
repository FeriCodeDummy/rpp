public class logicne_vrednosti {

  public static void main(String [] args){
  
    final int a=2,b= 3,c= 5,d= 7, e=11; // Create constants - first 5 prime numbers
        Scanner scanner = new Scanner(System.in); // Create input reader
        int num = scanner.nextInt(); // Get input from user
        
        if (num % a == 0){            // If remainder == 0, print true, otherwise print false
            System.out.println("true");

        }else{
            System.out.println("false");
        }
        if (num % b == 0){            // If remainder == 0, print true, otherwise print false
            System.out.println("true");
        }   
        else{
            System.out.println("false");
        }

        if (num % c == 0){            // If remainder == 0, print true, otherwise print false
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }                             

        if (num % d == 0){              // If remainder == 0, print true, otherwise print false
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if (num % e == 0){            // If remainder == 0, print true, otherwise print false
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

  
  }
  
}
