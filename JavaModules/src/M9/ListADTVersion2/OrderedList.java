package M9.ListADTVersion2;
class OderedList extends AbstractList {
    private int[] array;
    private int size;

    public OderedList() {
        array=new int[100];
        size=0;
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
        if (size!=array.length) {
            sort();
            int index=0;
            for (index=0;index<size; index++)
                if(array[index]>item)
                    break;
            if (index==size){
                array[index]=item;
                size++;
                return;
            }
            else{
                int temp=array[index];
                array[index]=item;
                index++;
                size++;
                while (index<size) {
                    int value=array[index];
                    array[index]=temp;
                    temp=value;
                    index++;
                }
            }
        }
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

    @Override
    public int indexOf(int item){
        if(size%2==0 && size!=0){
            if(item<=array[(size/2)-1]){
                for (int index = 0; index < size / 2; index++){
                    if (item == array[index]){
                        return index;
                    }
                }
            }
            else if(item>=array[size/2]){
                for(int index=size/2;index<size;index++){
                    if(item==array[index])
                        return index;
                }
            }
            else{
                return -1;
            }
        }
        else if(size%2==1){
            if(item<= array[size/2]) {
                for(int index=0;index<=size/2;index++) {
                    if(item==array[index]){
                        return index;
                    }
                }
            }
            else if(item>=array[(size/2)+1]){
                for(int index=size/2+1;index<size;index++){
                    if(item==array[index]){
                        return index;
                    }
                }
            }
            else{
                return -1;
            }
        }
        return -1;
    }
    
    
}