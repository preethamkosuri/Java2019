package Ds.M3.A1;
class Solution{
	static int partition(int[] a,int l,int h){
        int p=a[l];
        int temp,i=l,j=h;
        while(i<j){
            while(i<h && a[i]<=p){
                i++;
            }
            while(j>-1 && a[j]>p){
                j--;
            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }temp=a[l];
        a[l]=a[j];
        a[j]=temp;
        return j;
    }
    static void quicksort1(int[] a,int l,int h){
        if(l<h){
            int loc=partition(a, l, h);
            quicksort1(a, l, loc-1);
            quicksort1(a, loc+1, h);
        }
    }
	public static int[] quickSort(int[] a){
		quicksort1(a,0,a.length-1);
		return a;
	}
	
}