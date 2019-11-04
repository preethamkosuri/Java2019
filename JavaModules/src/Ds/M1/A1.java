package Ds.M1;
public class A1{
    static int count(int[] a){
        int n=a.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        count++;
                    }
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a=new int[]{0, -1, 2, -3, 1};
        int c=count(a);
        System.out.println(c);
    }
}