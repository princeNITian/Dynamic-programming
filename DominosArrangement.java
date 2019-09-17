import java.util.Scanner;

public class DominosArrangement
{
    private static int noOfArrangements(int n){
        int[] ways = new int[n+1];
        //base case :
        ways[0] = 1;
        ways[1] = 1;
        
        for(int i =2;i<=n;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
            
        return ways[n];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n in (2*n): ");
		n = sc.nextInt();
		
		System.out.println("Total No. Of Ways: "+noOfArrangements(n));
		
	}
	
}
