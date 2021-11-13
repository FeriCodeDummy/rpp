import java.util.Scanner;

public class astrolosko_znamenje {

  public static void main(String [] args){
  
    Scanner scanner = new Scanner(System.in); // Create user input

        String mesec = scanner.next(); // Get month from input
        int dan = scanner.nextInt(); // Get day from input
        int leto = scanner.nextInt(); // get year from input (needed for leap years check)
        String znamenje="";//initialize znamneje

        if (falseDate(mesec, dan, leto)){ // Runs falseDate method to check if date is correct
            System.out.println("Datum ni pravilen"); // If it's not, print error and stop program
            System.exit(0);
        }

        switch (mesec) { // chooses the action for given month
            case "januar":
                if (dan < 20){
                    znamenje = "Kozorog";
                }
                else {
                    znamenje = "Vodnar";
                }
                break;

            case "februar":
                if (dan < 19){
                    znamenje = "Vodnar";}
                else{
                    znamenje = "Ribi";

                }
                break;

            case "marec":
                    if (dan < 21){
                        znamenje = "Ribi";
                    }
                    else{
                        znamenje = "Oven";
                        }
                    break;

            case "april":
                if (dan < 20) {
                    znamenje = "Oven";
                } else{
                    znamenje = "Bik";
                }
                break;

            case "maj":
                if (dan < 21){
                    znamenje = "Bik";}
                else{
                    znamenje = "Dvojček";
                }

            case "junij":
                if (dan < 21){
                    znamenje = "Dvojček";}
                else{
                    znamenje = "Rak";
                }

            case "julij":
                if (dan < 23){
                    znamenje = "Rak";}
                else {
                    znamenje = "Lev";
                    }

            case "august":
                if (dan < 23){
                    znamenje = "Lev";}
                else{
                    znamenje = "Devica";
            }

            case "september":
                if (dan < 23){
                    znamenje = "Devica";}
                else{
                    znamenje = "Tehtnica";
                }
                break;

            case "oktober":
                System.out.println("Pride sem");
                if (dan < 23) {
                    znamenje = "Tehtnica";}
                else{
                    znamenje = "Škorpijon";
            }
                break;

            case "november":
                if (dan < 22) {
                    znamenje = "Škorpijon";
                }
                else {
                    znamenje = "Strelec";
                    }
                break;

            case "december":
                if (dan < 22){
                    znamenje = "Strelec";
                }
                else {
                    znamenje = "Kozorog";
                }
                break;

        }
        System.out.println(znamenje); // Print znamenje
  
  }
  
  private static boolean falseDate(String mesec, int dan, int leto) { // Create method to check if date is false, it takes in arguments month, day, year

        switch(mesec){
            case "januar":
            case "marec":
            case "maj":
            case "julij":
            case "avgust":
            case "december":
            case "oktober":
                if (dan < 1 || dan > 31 ){ // Check day count
                    return true;
                }
                break;
            case "junij":
            case "september":
            case "november":
                if (dan < 1 || dan > 30 ){ // Check day count
                    return true;
                }
                break;
            case "februar":
                if (dan < 1 || dan >= 29){
                    if (dan == 29){ // Check for leap year
                        return leto % 4 != 0;
                    }
                    return true;
                }
                break;
            default: 
                return true;
        }
        return false;
    }
  
  
  
}
