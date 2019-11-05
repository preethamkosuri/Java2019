package Ds.M2.A3;
class Solution{
	public int[] sortInsertion(int[] c1){
		for(int i=1;i<c1.length;i++){
            for(int j=i-1;j>=0;j--){
                if (c1[j]>c1[j+1]){
                    int t=c1[j+1];
                    c1[j+1]=c1[j];
                    c1[j]=t;
                }
            }
		}
		return c1;
	}
	public int[] sortSelection(int[] c){

		for(int i=0;i<c.length-1;i++){
            for(int j=i+1;j<c.length;j++){
                if (c[j]<c[i]){
                    int t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
		return c;
	}
}