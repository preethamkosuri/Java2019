package M9.ListADTVersion2;
class List extends AbstractList {
    private int[] array;
    private int size;
	public int length;

    public List() {
        array = new int[100];
        size = 0;
    }
    public void add(int item) {
        array[size] = item;
        size++;

    }
    public int search(int item){
        for(int i=0;i<size;i++){
            if(array[i]==item){
                return i;
            }
        }
        return -1;
    }
}