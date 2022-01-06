import java.util.ArrayList;
import java.util.Arrays;

public class Osemsmerka{

  public static void main(String[] args){
    // It doesn't work for diagonals  
    final int[][] testcase1 = {
						{1,2,3,4,5},
						{6,7,6,7,8},
						{9,1,0,1,1},
						{1,2,1,3,1},
						{4,1,5,1,6}
						};
    
     final int[][] testcase2 = {
				{1, 2, 3, 4, 5 },
				{6, 7 ,8 ,9 ,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};

	
		final int pattern = 371;
    System.out.println(Arrays.toString(locatePattern(testcase1, pattern)));
  }
  
  private static int[] locatePattern(int[][] matrix, int pattern) {
		int[] patternArray = splitPattern(pattern);
		int m = matrix.length;
		int n = patternArray.length;

		// Test za vrste v desno

		for (int i = 0; i < matrix.length; i++){
			int[] line = matrix[i];
			for (int j = 0; j < line.length - n + 1; j++){
//				System.out.print(Arrays.toString(patternArray) + " : ");
//				System.out.println(Arrays.toString(makeLineArray(line, j, n)));
				if(Arrays.equals(patternArray, makeLineArray(line, j, n))){
					return new int [] {i, j, 5};
				}
			}
		}

		// Test za vrste v levo

		for (int i = 0; i < matrix.length; i++){
			int[] line = matrix[i];
			for (int j = 0; j < line.length - n + 1; j++){
				if(Arrays.equals(patternArray, reverse(makeLineArray(line, j, patternArray.length), patternArray.length))){
					return new int [] {i, j-1 + n, 1};
				}
			}
		}

		// Test za stolpce navzdol
		for (int i = 0; i < matrix.length; i++){
			int[] line = matrix[i];
			for (int j = 0; j < line.length - n + 1; j++){
				//System.out.print(Arrays.toString(patternArray) + " : ");
				//System.out.println(Arrays.toString(makeCoulmnArray(matrix, i, j, m, n)));
				if(Arrays.equals(patternArray, makeCoulmnArray(matrix, i, j, m, n))){
					return new int [] {j, i, 7};
				}
			}
		}

		// Test za stolpce navzgor

		for (int i = 0; i < matrix.length; i++){
			int[] line = matrix[i];
			for (int j = 0; j < line.length - n + 1; j++){
//				System.out.print(Arrays.toString(patternArray) + " : ");
//				System.out.println(Arrays.toString(reverse(makeCoulmnArray(matrix, i, j, m, n), n)));
				if(Arrays.equals(patternArray, reverse(makeCoulmnArray(matrix, i, j, m, n), n))){
					return new int [] {j-1 + n, i, 3};
				}
			}
		}

		return new int[]{-1, -1 , -1};
	}

	private static int[] makeLineArray(int[] line, int startPosition, int l) {
		int[] copied = new int[l];

		System.arraycopy(line, startPosition + 0, copied, 0, l);
		//System.out.println(Arrays.toString(copied));
		return copied;
	}

	private static int[] makeCoulmnArray(int[][] Matrix, int index, int start, int l, int n){
		int []column = new int [l];

		int i =0;
		for (int[] j: Matrix){
			column[i] = j[index];
			i++;
		}
		return makeLineArray(column, start, n);

	}

	static int[] reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		return b;
	}

	private static int[] splitPattern(int pattern) {
		ArrayList<Integer> al = new ArrayList<>();
		while (pattern > 0){
			al.add(pattern%10);
			pattern /= 10;
		}
		int[] wrong = new int[al.size()];
		int i = 0;
		for (int x: al){
			wrong[i] = x;
			i++;
		}
		return reverse(wrong, wrong.length);
	}



}
