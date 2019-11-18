package Ds.Hash;
class A2{
	private String[] keys;
	private String[] values;
	private int maxsize,currentsize;

	public A2(int capacity){
		maxsize=capacity;
		currentsize=0;
		keys=new String[maxsize];
		values=new String[maxsize];
	}

	public int getsize(){
		return currentsize;
	}

	public void makeempty(){
		currentsize=0;
		keys=new String[maxsize];
		values=new String[maxsize];
	}

	public boolean isfull(){
		return currentsize==maxsize;
	}

	public boolean isempty(){
		return currentsize==0;
	}
	public int hash(String key){
		return key.hashCode()%maxsize;
	}

	public boolean contains(String key){
		return get(key)!=null;
	}

	public void put(String key, String value){
		int i=hash(key);
		while(keys[i]!=null && !keys[i].equals(key))
			i = (++i)%maxsize;
		
		keys[i]=key;
		values[i]=value;
		currentsize++;
		
	}

	public void delete(String key){
		int i=hash(key);
		while(!key.equals(keys[i])){
			i=(i+1)%maxsize;
		}
		keys[i]=values[i]=null;
		for(i=(i+1)%maxsize;keys[i]!=null;i=(i+1)%maxsize){
			String temp1=keys[i],temp2=values[i];
			keys[i]=values[i] = null;
			currentsize--;
			put(temp1,temp2);
		}
	}

	public String get(String key) {
		int i=hash(key);
		while(keys[i]!=null){
			if(keys[i].equals(key)){
				return values[i];
			}
			i=(i+1)%maxsize;
		}
		return null;
	}
	public void display(){
		for(int i=0;i<maxsize;i++){
			if(keys[i]!=null){
				System.out.println(keys[i]+"-"+values[i]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		A2 o=new A2(10);
		o.put("hi","1234");
		o.put("hello","12345456");
		o.put("jj","sdfg");
		System.out.println(o.maxsize);
		System.out.println(o.get("jj"));
		o.delete("hi");
		o.display();
	}
}