public class pescena_ura{

  public static void main(String [] args){
    
      // repeat is not in-build but custom method!
        String symbol = " "; // Symbol for filling sand hour
        System.out.println(repeat(visina*2, "0")); // Print first line
        for (int i=0; i < visina - 1; i++){ // print upper triangle
            if (i == pesek){
                symbol = "*"; // Create symbol to sand
            }
            System.out.println(repeat(i+1 ," ") + "0" + repeat((visina - i)*2 - 4, symbol) + "0"); // print line
        }
        symbol = " ";
        for (int i=0; i<visina - 1; i++){ // print upper triangle
            if (visina - i - 1 == pesek){
                symbol = "*"; // Change symbol to sand
            }
            System.out.println(repeat(visina - i - 1, " ") + "0" + repeat(i*2, symbol) + "0"); // print line
        }
        System.out.println(repeat(visina*2, "0")); // Print last line
    }
  }

   public static String repeat(int repeat, String s){ // return repeated string
        return new String(new char[repeat]).replace("\0", s);
    }
  
}
