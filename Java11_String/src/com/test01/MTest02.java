package com.test01;

import java.util.StringTokenizer;

public class MTest02 {

	public static void main(String[] args) {
		
		//substring
		String str01 = "The String class represents character string."; 
		System.out.println(str01.substring(4, 7));
		
		// split
		String str02 = "The,String,class";
		String[] splitArr = str02.split(",");
		// 콤마로 자르겠다 
		for(int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		
		// StringTokenizer
		String str03 = "The_String_class";
		
		StringTokenizer tokenizer = new StringTokenizer(str03, "_");
		while (tokenizer.hasMoreTokens()) { // 토큰으로 하나씩 잘라온다. 위에는 커서를 이용해서 가져온거고 없으면 false로 끝
			System.out.println(tokenizer.nextToken());
		}

				
		
	}
	
}
