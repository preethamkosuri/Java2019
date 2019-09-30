/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */
package M3.Stats;
import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        int n =arr.length;
        if(n>0) {
            double sum=0;
        	for (int i=0;i<n;i++) {
        		sum+=arr[i];
        		}
        	return sum/n;
        }
        else {
        	return 0;
        }
    	
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        Arrays.sort(arr);
        int n = arr.length;
        if(n>0){
        if (n % 2==0) {
            return (double)(arr[(n/2)-1] + arr[n / 2]) / 2.0;	
        }
        return (double)arr[n/2];
        }
        return 0;
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static double mode(int[] arr) {
        //  Your code goes here....
        int n=arr.length;
        if(n>0){
            int f=0,m=arr[0];
            for(int i=0,c=0;i<n;i++,c=0){
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        ++c;
                    }
                if(f<c){
                    f=c;
                    m=arr[i];
                }
                }
            }
            if(f!=1){
                return m;
            }

        }
        return 0;
    }
    /**
     * This method returns the variance of the input array.
     * Make use of the mean function which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
    	int n=arr.length;
        double v=0;
        for (int i=0;i<n;i++) {
        	v+=Math.pow(arr[i]-mean(arr),2); 	
        }
        return  v/n;
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
    	 return Math.sqrt(variance(arr));
    }
}