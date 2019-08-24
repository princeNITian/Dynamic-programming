import java.util.Scanner;
public class WaysToHome
{
    public static int numWays(int m,int n){
        int ways[][] = new int[m][n];
        // only 1 option left i.e. to move down.
        for(int i=0;i<m;i++){
            ways[i][n-1]=1;
        }
        // only 1 option left i.e. to move right.
         for(int j=0;j<n;j++){
            ways[m-1][j]=1;
        }
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                ways[i][j] = ways[i][j+1] + ways[i+1][j];
            }
        }
        return ways[0][0];
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the grid size(m * n): ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int sol = numWays(m,n);
		System.out.println("The no. of ways : "+sol);
	}
}
