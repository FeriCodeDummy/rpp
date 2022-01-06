import java.util.Arrays;
import java.util.Scanner;
public class PadajociPredmeti{
  
  public static void main(String[] args){
    
      igraj() // Not really nice coding but it works
    
  }
  
  	public static void igraj(){
      Scanner s = new Scanner(System.in);
      String[][] igra = init(9);
      System.out.println(printArrayArray(igra));
      int score = 0;
      while (true){
        String move = s.next();
        if (move.equals("exit")){
          break;
        }
        igra = world(9, igra, igra[8], move);
        System.out.print(printArrayArray(igra));
        score += 1;
        System.out.println("Score: " + score);
      }
      s.close();
      System.out.println("Final score: " + score);
      System.out.println(Arrays.toString(init(4)));
    }

	public static String[] vrsta(int n){
		String[] s = new String[n];
		for (int i = 0; i < n; i++ ){
			int r = (int) (Math.random() * 9);
			if (r == i){
				s[i] = "X";
			}
			else{
				s[i] = "*";
			}
		}
		return s;
	}

	public static String[][] init(int n){
		String[][] svet = new String[n][n];
		String[] initer = new String[n];
		for (int i = 0; i <n;i++){
			initer[i] = "*";
		}
		for (int i = 1; i < n;i++){
			svet[i] = initer.clone();
		}
		svet[n-1][n/2] = "0";
		svet[0] = vrsta(n);
		return svet;
	}

	public static String printArrayArray(String[][] printer){
		StringBuilder r = new StringBuilder();
		for(String[] sArray: printer) {
			for(String element: sArray){
				r.append(element).append(" ");
				//System.out.println(Arrays.toString(sArray));
			}
			r.append("\n");
		}
		return r.toString();
	}

	public static String[][] world(int n, String[][] current, String[] PlayerPosition, String move){
		String[][] svet = new String[n][n];
		svet[0] = vrsta(n);
		String[] player = new String[n];
		for (int i = 0; i<n; i++){
			player[i] = "*";
		}
		switch (move) {
			case "s" -> player = PlayerPosition;
			case "d" -> {
				try{
					int playerIndex = Arrays.asList(PlayerPosition).indexOf("0");
					player[playerIndex + 1] = "0";
				}
				catch(Exception e){
					System.out.println("Illegal move, player position remains the same");
					player = PlayerPosition;

				}
			}
			case "a" -> {
				try{
					int playerIndex = Arrays.asList(PlayerPosition).indexOf("0");
					player[playerIndex - 1] = "0";
				}
				catch(Exception e){
					System.out.println("Illegal move, player position remains the same");
					player = PlayerPosition;
				}
			}

			default -> player = PlayerPosition;
		}
		svet[0] = vrsta(n);
		System.arraycopy(current, 0, svet, 1, svet.length - 1);
		if (svet[n-1][Arrays.asList(player).indexOf("0")].equals("X")) {
			System.out.println("YOU LOST !!!");
			System.exit(0);
		}
		else {
			svet[n-1] = player;
		}
		return svet;
	}
}

}
