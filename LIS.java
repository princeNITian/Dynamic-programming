/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class LIS
{
    private static int longest_inc_sub(int[] nums){
        int n = nums.length;
        int max_length = 0;
        int[] LIS = new int[n];
        
        for(int i =0;i<=n-1;i++){
            LIS[i] = 1;
        }
        
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j] && LIS[i]<LIS[j]+1){
                    LIS[i] = LIS[j] + 1;
                }
            }
        }
        // This loop just finds the maximum value among all the LIS[i] values
        for(int i=0;i<n;i++){
            if(max_length<LIS[i])
            max_length = LIS[i];
        }
        return max_length;
    }
	public static void main(String[] args) {
	    
	     int[] nums = {11, 23, 10, 37, 21};
	     
		 System.out.println("The length of longest increasing subsequence for the array [11, 23, 10, 37, 21] is : " 
		 + longest_inc_sub(nums));
	}
}
