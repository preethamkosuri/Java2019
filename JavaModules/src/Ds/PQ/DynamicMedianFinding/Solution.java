package Ds.PQ.DynamicMedianFinding;
class Solution{
	public static double[] dynamicMedian(double[] arr){
		double[] a=new double[arr.length];
        for(int i=0;i<arr.length;i++){
            double temp=arr[i];
            int i1=i;
            for(int j=i-1;j>-1;j--){
                if(temp<arr[j]){
					arr[i1--]=arr[j];
				}
                else{
					break;
				}
            }
            arr[i1]=temp;
            if((i+1)%2==1){
				a[i]=arr[i/2];
			}
            else{
                int j=(i+1)/2;
                a[i]=(arr[j-1]+arr[j])/2;
            }
        }
        return a;
	}
}