package azeroth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Utils {
	
	private static final Utils INSTANCE = new Utils();
	
	public static Utils newUtils () {
		return INSTANCE;
	}

	public Utils() {
	}
	//create a new hashMap instance
	public static <K,V>HashMap<K,V> newHashMap(){
		return new HashMap<K,V>();
	} 
	//create a new array list instance
	public static <K>List<K> newArrayList(){
		return new ArrayList<K>();
	}
}
