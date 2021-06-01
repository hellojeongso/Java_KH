package com.test04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MTest {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for (int i = 111; i < 116; i++) {
			map.put(i, i+"abc");
		}
		
		//System.out.println(map);
		//순서가 없고 마음대로 저장하는걸 볼 수 있다.
		map.put(112, "115abc");
		
		//System.out.println(map);
		//key 중복 불가능 value 중복 가능
		
		printMap(map);
	}

	private static void printMap(Map<Integer, String> map) {
		// key 들만 출력하자 
		// map안의 key들을 keyset을 이용해서 keys에 담아준다.
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		// value 들만 출력하자
		Collection<String> values = map.values();
		System.out.println(values);
	    // key가 111인 value를 출력하자
		System.out.println(map.get(111));
		
		// Entry : key와 value를 한번 에 관리하는 map과는 달리 key, value 각각을 관리한다
		// Map<key, value> : get(key) - > value 리턴   키를 통해야만 밸류 가져올수있다  key를 통해서 value를 가지고 옴 
		// Entry : getKey(), getValue()
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			// System.out.printf("%d : %s\n", entry.getKey(), entry.getValue());
				
		}   
		
		// key가 111인 요소의 key와 value를 각각 출력하자
		int key = 111;
		Set<Map.Entry<Integer, String>> test = map.entrySet();
		Iterator<Entry<Integer, String>> ir = test.iterator();
		while (ir.hasNext()) {
			Entry<Integer, String> entry = ir.next();
			if (entry.getKey() == key) {
				System.out.println(key + " : " + entry.getValue());
			}
		}
			
	
	}
}