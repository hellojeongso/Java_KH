package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestServer03 {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);
		System.out.println("서버입니다.");
		
		byte[] buff = new byte[1024];
		
		DatagramPacket recieveP = new DatagramPacket(buff, buff.length);
		
		ds.receive(recieveP);
	
		System.out.println(new String(recieveP.getData()));
		
		ds.close();
		ds.disconnect();
	}
}
