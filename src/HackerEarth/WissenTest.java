package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WissenTest {
	

	static int minParkingSpaces(int[][] parkingStartEndTimes) {
          
		int noOfParking = 0;
		
		int count = 0;
		Map<Integer,List<Integer>> startEnd = new TreeMap<>();
		
		for(int i = 0; i< parkingStartEndTimes.length;i++) {
			
			
			int start = parkingStartEndTimes[i][0];
			int end = parkingStartEndTimes[i][1];
			
			if(startEnd.get(start) != null) {
				List<Integer> listEnd = startEnd.get(start);
				listEnd.add(end);
				startEnd.put(start, listEnd);
			}else {
				List<Integer> listEnd = new ArrayList<Integer>();
				listEnd.add(end);
				startEnd.put(start, listEnd);
			}
			
			
		}
		
		System.out.println(startEnd);
		
		for(Entry<Integer,List<Integer>> e : startEnd.entrySet()) {
			  Collections.sort(e.getValue());
		}
		
		System.out.println(startEnd);
		
		List<Integer> keyList = new ArrayList<Integer>(startEnd.keySet());
		
		System.out.println(keyList);
		
		count = count + startEnd.get(keyList.get(0)).size();
		
		System.out.println(count);
		for(int i =1; i< keyList.size();i++) {
			
			for(int j =0; j< i;j++) {
				List<Integer> elements = startEnd.get(keyList.get(j));
				if(!elements.isEmpty()) {
					if(keyList.get(i) < elements.get(0)) {
						count++;
					}
					else {
						elements.remove(0);
						break;
					}
				}
			}
			
			
		}
		return count;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}
