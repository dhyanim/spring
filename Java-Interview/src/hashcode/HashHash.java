package hashcode;

import java.util.HashMap;

public class HashHash {

	public int x;
	HashHash(int xVal){
		x= xVal;
	}
	public boolean equals(Object obj){
		HashHash hash = (HashHash)obj;
		if(hash.x == this.x){
			return true;
		}else{
			return false;
		}
		
		
	}
	@Override
	public int hashCode() {
		return x * 19;
	}
	
	public static void main(String[] args) {
		
		HashMap<Object, String> map = new HashMap<Object, String>();
		HashHash one = new HashHash(20);
		HashHash two = new HashHash(20);
		map.put(two, "test");
		System.out.println(map.get(one));
		System.out.println(one.equals(two));
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		System.out.println(one == two);
		
	}
	
}
