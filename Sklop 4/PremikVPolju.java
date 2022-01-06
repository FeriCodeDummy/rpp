public class PremikVPolju{

  public static void main(String[] args){
    int[] iarr = {1,2,3,4,5};
    
    System.out.println(Arrays.toString(movePlace(iarr)));
  }
  
  
  private static int[] movePlace(int[]line) {
			int[] result = new int[line.length];
			result[0] = line[line.length - 1];
			int i = 1;
			for (int x: line){
				result[i] = x;
				if (i == line.length -1){
					break;
				}else{i++;}
			}
			return result;
		}
}
