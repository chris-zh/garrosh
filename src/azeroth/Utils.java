package azeroth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Utils {
	private static long blockStartTime;
	
	public static long getBlockStartTime(){
		return blockStartTime;
	}

	//Instantiate a tool class makes no sense.
	private Utils() {
		throw new AssertionError();
	}
	//Create a new hashMap instance
	public static <K,V>HashMap<K,V> newHashMap(){
		return new HashMap<K,V>();
	} 
	//Create a new array list instance
	public static <K>List<K> newArrayList(){
		return new ArrayList<K>();
	}
	//System out print
	public static void print(Object... obj){
		for(Object ele:obj){
			System.out.println(ele);
		}
	}
	//set block start time
	public static void setBlockStart(){
		blockStartTime = System.nanoTime();
	}
	//calculate block consuming time
	public static void getBlockConsuming(String unit){
		long u =0L;
		if("us".equals(unit)){
			u = 1000;
		}else if("ms".equals(unit)){
			u = 1000000;
		}
		long consumingTime = System.nanoTime() - blockStartTime;
		print(String.format("%1$9d", consumingTime/u)+" "+unit);
	}
	//calculate block consuming time (ms)
	public static void getBlockConsuming(){
		long consumingTime = System.nanoTime() - blockStartTime;
		print(String.format("%1$9d", consumingTime/1000/1000)+" ms");
	}
}
