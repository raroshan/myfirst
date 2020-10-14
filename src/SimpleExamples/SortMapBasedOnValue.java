package SimpleExamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMapBasedOnValue {

	public static void main(String[] args) {
		Map<Integer, Integer> initalmap = new HashMap<Integer, Integer>();
		initalmap.put(1, 10);
		initalmap.put(5, 17);
		initalmap.put(11, 19);
		initalmap.put(20, 5);
		initalmap.put(6, 8);
		initalmap.put(17, 3);

		System.out.println("Default Map-Bucket order"+initalmap);

		
		  Map<Integer, Integer> treeMap1 = new TreeMap<Integer, Integer>();
		  for(Entry<Integer, Integer> entry : initalmap.entrySet()) {
		  treeMap1.put(entry.getKey(), entry.getValue()); }
		 
		  System.out.print("using Tree Map-         ");
		  System.out.println(treeMap1);

		Map<Integer, Integer> treeMap2 = initalmap.entrySet().stream()
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (o1, o2) -> o1, TreeMap::new));
		System.out.println("Using Streams           "+treeMap2);
		
		Map<Integer, Integer> treeMap3 = new TreeMap<Integer, Integer>(
        (i,j)->{
        	return i<j?-1:i>j?1:0; 
        });
		treeMap3.putAll(initalmap);
		System.out.println(treeMap3);
	}

}

//class MapValueComparator implements Comparator<Integer>{
//	
//	public int compare(Integer i1, Integer i2) {
//		
//		if(i1 < i2) {
//			
//		}
//		
//	}
//	
//}
