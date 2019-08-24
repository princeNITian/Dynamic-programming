import java.util.Scanner;
public class Stairway
{
    public static int stairwayToHeaven(int n){
        // array of length n+1 index will 0 to n.
        int ways[] = new int[n+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<=n;i++){
            ways[i]= ways[i-1]+ways[i-2];
        }
        return ways[n];
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number of stairs: ");
	    int x = scan.nextInt();
		int k = stairwayToHeaven(x);
		System.out.println("Total no. of ways: "+k);
	}
}
