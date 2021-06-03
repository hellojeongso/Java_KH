package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class TestClient03 {
	
	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트 입니다.");
		
		byte[] buff = "연습입니다.".getBytes();
		
		DatagramPacket sendP = new DatagramPacket(buff, buff.length,InetAddress.getByName("localhost"),8888);
		
		ds.send(sendP);
		
		ds.close();
		ds.disconnect();
	}

}
