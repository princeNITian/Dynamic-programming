public class SumOfRange
{
    private static int[] Sum_Until = new int[100000];
    
    // preProcessing function 
    private static void preProcessing(int[] my_arr){
        int n = my_arr.length;
        Sum_Until[0] = my_arr[0];
        
        for(int i = 1;i<=n-1;i++){
            Sum_Until[i] = Sum_Until[i-1] + my_arr[i];
        }
    }
    
    // Finding Range method..
    private static int sumRange(int i ,int j){
        if(i==0){
            return Sum_Until[j];
        }else{
            return Sum_Until[j]-Sum_Until[i-1];
        }
    }
    
	public static void main(String[] args) {
		// values in array indices..
		int c[] = {8,1,2,4,6,3,5};
		// Calling preProcessing
		preProcessing(c);
		
		System.out.println("Query SumRange(1,4): "+sumRange(1,4));
		System.out.println("Query SumRange(3,5): "+sumRange(3,5));
		System.out.println("Query SumRange(2,6): "+sumRange(2,6));
		
	}
}
