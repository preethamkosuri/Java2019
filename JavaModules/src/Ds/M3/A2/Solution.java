package Ds.M3.A2;
class Solution{
	static void merge(String[] a,int l,int m,int h){
        int n1=m-l+1; 
        int n2=h-m;
        String s1[]=new String[n1]; 
        String s2[]=new String[n2];
        for(int i=0;i<n1;i++){
            s1[i]=a[l+i];
        } 
        for(int j=0; j<n2;j++){
            s2[j]=a[m+1+j];
        }
        int i=0,j=0,k=l; 
        while (i<n1 && j<n2){ 
            if (s1[i].compareTo(s2[j])<=0){ 
                a[k]=s1[i]; 
                i++; 
            } 
            else{ 
                a[k]=s2[j]; 
                j++; 
            } 
            k++; 
        }
        while (i<n1){ 
            a[k]=s1[i]; 
            i++; 
            k++; 
        }
        while(j<n2){ 
            a[k]=s2[j]; 
            j++; 
            k++;
        } 
    }
    static void sort(String[] a,int l,int h){ 
        if(l<h){
            int m=(l+h)/2;
            sort(a,l,m); 
            sort(a,m+1,h);
            merge(a,l,m,h); 
        } 
    }
	public static String[] mergeSort(String[] a){
		sort(a,0,a.length-1);
		return a;
	}
	
}