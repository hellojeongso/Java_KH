package com.test02;

import java.io.*;
import java.net.*;

public class TestServer02 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket serviceSocket;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try {
			serverSocket = new ServerSocket(9999);
		} catch (IOException e) {
		}
		
		while(true){
			System.out.println("client를 기다립니다...");
			try {
				serviceSocket = serverSocket.accept();
				System.out.println("client가 접속했습니다...");
				
				in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));

				out = new PrintWriter(serviceSocket.getOutputStream(),true);
				
				String inputLine;
				while((inputLine = in.readLine()) != null){
					System.out.println("client가 보낸 메시지 : " + inputLine);
					out.println(inputLine);
				}
				
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
				
				System.out.println("client에 데이터 전송했습니다...");
				
			} catch (IOException e) {
			}
		}
	}
}
