package com.test01;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MTest03 {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		URLConnection urlConnection = new URL("https://www.google.com").openConnection(); // 오픈커넥션 연결해달라고 요청

		BufferedInputStream buff = new BufferedInputStream(urlConnection.getInputStream());
															// 데이터를 받아온 것 
		int byteRead;
		while((byteRead = buff.read()) != -1) {
			System.out.print((char)byteRead);
		}
		
		buff.close();
	}

}
