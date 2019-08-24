import java.util.Scanner;
//import java.lang.Math;
public class RodCut
{
    public static int rodCut(int cost[],int len){
        int rod[] = new int[len+1];
        rod[0]=0;
        int max_value = Integer.MIN_VALUE;
        
        for(int i =1;i<=len;i++){
            for(int j = 1;j<=i;j++){
                max_value = Math.max(max_value,cost[j]+rod[i-j]);
            }
            rod[i] = max_value;
        }
        return rod[len];
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of rod: ");
		n = scan.nextInt();
		int cost[] = new int[n+1];
		System.out.println("Enter Price List: ");
		cost[0] = 0; // As usual
		for(int i=1;i<=n;i++){
		    cost[i]=scan.nextInt();
		}
		
		int maxProfit = rodCut(cost,n);
		System.out.println("Max Profit: " + maxProfit);
		
	}
}
