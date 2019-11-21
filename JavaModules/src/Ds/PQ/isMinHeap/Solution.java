package Ds.PQ.isMinHeap;
class Solution{
	public static boolean isMinHeap(double[] arr){
		int size=arr.length;
		if(size==0){
			return false;
		}
		else if(size==1){
			return true;
		}
		else{
			for(int i=0;i<size/2;i++){
				if((2*i+1)<size){
					if(arr[i]>arr[(2*i+1)])
						return false;
				}
				if((2*i+2)<size){
					if(arr[i]>arr[(2*i+2)])
						return false;
				}
			}
			return true;
		}
		
	}
}