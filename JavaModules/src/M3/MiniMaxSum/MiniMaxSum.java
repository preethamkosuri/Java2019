/**
 * Given an array of elements, return the String that has two values separated
 * by commans. The first value is the sum of all the elements except minimum
 * and the second value is the sum of all the elements except the maximum.
 * 
 * Input : {1,2,3,4,5};
 * Output : 14,10
 * 
 * Input : {1,2}
 * Output : 2,1
 * 
 * @author Siva Sankar
 */
package M3.MiniMaxSum;
public class MiniMaxSum {

    /**
     * This method returns the minimum element in the array.
     * @param arr, contains the elements in arr.
     * @return the minimum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int min(int[] arr) {
        //  Your code goes here...
        int min=arr[0];
        for (int i=0;i<arr.length;i++) {
        	if (arr[i]<min) {
        		min=arr[i];	
        	}
        }
        return min;
    }

    /**
     * This method returns the maximum element in the array.
     * @param arr, contains the elements in arr.
     * @return the maximum element in the arr. If there are no elements, then
     * it should return -1.
     */
    public static int max(int[] arr) {
        //  Your code goes here...
    	int max=arr[0];
    	for (int i=0;i<arr.length;i++) {
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    	}
        return max;
    }

    /**
     * This method returns the sum of all the elements in the array.
     * @param arr, contains the elements in arr.
     * @return the sum of all the elements in the arr. returns -1 if there are
     * no elements.
     */
    public static String sum(int[] arr) {
        //  Your code goes here...
        int a=min(arr);
        int b=max(arr);
        int sum=0;
        for (int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        int sum1=sum-a;
        int sum2=sum-b;
		String s=sum1+","+sum2;
	    return s;
    }
   
    
    /**
     * Make use of the functions defined for finding the 
     * minimum element, maximum element and the sum of all the elements of teh 
     * array arr.
     * 
     * @param arr, the input array.
     * @return the string version of maxSum and minSum separated by commas.
     */
    public static String miniMaxSum(int[] arr) {
        //  Your code goes here...
        if (arr.length>1) {
        	return (sum(arr));
        }
        return "0,0";
    }
}