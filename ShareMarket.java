public class ShareMarket
{
    public static int maxProfit(int Price[]){
        int n = Price.length;
        int Min_Uptil[] = new int[n];
        int Max_Profit[] = new int[n];
        int heighest_Profit = Integer.MIN_VALUE;
        Min_Uptil[0] = Price[0];
        
        for(int i=1;i<n;i++){
            Min_Uptil[i] = Math.min(Min_Uptil[i-1],Price[i]);
        }
        
        for(int i=1;i<n;i++){
            Max_Profit[i]=Price[i]-Min_Uptil[i];
            
            if(heighest_Profit<Max_Profit[i]){
                heighest_Profit = Max_Profit[i];
            }
        }
        
        return heighest_Profit;
    }
    
	public static void main(String[] args) {
		// Price array on days
		int c[] = {8,1,2,4,6,3};
		int maxP = maxProfit(c);
		System.out.println("Max profit: "+ maxP);
	}
}
