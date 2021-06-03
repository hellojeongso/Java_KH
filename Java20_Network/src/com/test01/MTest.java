package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr);
		System.out.println("localhost: " + addr.getHostAddress());
		System.out.println("host name: " + addr.getHostName()+ "\n");
		// 내 컴퓨터의 실제 ip주소와 이름이 출력된다.
		
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
		for (int i = 0; i < naver.length; i++) {
			System.out.println(naver[i].getHostName() + ":" + naver[i].getHostAddress());
			// 네이버로 실제 연결해주는 IP를 찾아온다.
		}
	}
}