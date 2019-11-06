package M9.ListADTVersion2;
class List extends AbstractList {
    
    public void add(int item) {
        array[size] = item;
        size++;

    }
    public int indexOf(int item){
        for(int i=0;i<size;i++){
            if(array[i]==item){
                return i;
            }
        }
        return -1;
    }
}