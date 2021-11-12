public class zmnozek_ekstremov {

  public static void main(String[] args) {
        
        int[] arr = new int[3]; // Create integer array with size 3 
        Scanner scanner = new Scanner(System.in); // Create input reader object - scanner
        for (int i = 0; i< 3; i++){  // Loop 3 times 
            int t  = scanner.nextInt(); //get integer input
            arr[i] = t; // add it to array
        }
        Arrays.sort(arr); // Sort array 
        System.out.println(arr[0] * arr[2]); // multiply first and last element and print result

}
