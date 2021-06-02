package com.test01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest04 {
	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		// MyOutput(fi)에 빨간줄 떠있는거 클릭해서 try catch시킴 
		// 확인해보니 a.txt메모장에 연습중입니다. java.io 어렵다 뜸
		try {
			MyOutput(fi);
			MyInput(fi);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
		private static void MyInput(File fi) throws Exception {
			FileReader fr = new FileReader(fi);
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
			
			fr.close(); 
		}
	
	// throw : 예외를 발생
	// throws : 예외를 위임 -> "예외가 발생할 수 있는 명령문을 가진 메소드"를 호출
	// MyOutput에 throws 걸려 있어서 IOException을 발생시킬수 있으니 처리해주세요?
	private static void MyOutput(File fi) throws IOException {
		FileWriter fw = new FileWriter(fi, true); // <- 예외를 발생시킬 수 있는 문장
										// 괄호에 true치면 런타임 누를때마다 똑같이 하나씩 증가함
										// false면 덮어쓰기
		fw.write("abcdefg\n");			// api fileWriter 가서 이유 알 수 있음.
		//api 보면 write는 캐릭터배열인데 문자열배열이랑 똑같아서 문자열을 썼다..
		fw.append("연습중입니다.").append("java.io 어렵다.\n\n");
		// 메소드 연결해서 사용할 수 있는걸 메소드체이닝이라고 한다.
		// append api확인해보기
		fw.close();
	}
}
