package M9.ListADTVersion2;
class OderedList extends AbstractList {
    private int[] array;
    private int size;

    public OderedList() {
        array = new int[100];
        size = 0;
    }
    public void sort(){
        int temp;
        for (int i=1;i<array.length;i++) {
            for (int j=i;j>0;j--){
                if (array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j=1];
                    array[j-1]=temp;
                }


            }
        }
    }
    public void add(int item) {
        array[size] = item;
        size++;
        sort();

    }
    public int search(int item){
        int last=size;
        int first=0;
        int mid=(first+last)/2;  
        while(first<=last){  
            if(array[mid]<item){  
                first=mid+1;     
            }else if(array[mid]==item){  
                return mid;
            }else{  
                last=mid-1;  
            }  
            mid=(first+last)/2;  
        } 
        return -1; 
    }  
    
    
}