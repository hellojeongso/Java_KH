package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {
	public static void main(String[] args) {
		// File import 하기
		// 해당 경로에 fi 생성을 만들거야.라는 명령
		File fi = new File("c:/TEST_IO");
		
		if (fi.exists()) {
			System.out.println("exists!");
		} else {
			System.out.println("new!");
			fi.mkdirs(); // mkdirs: make directory(디렉토리는 윈도우에 폴더라는 뜻)라는 뜻 
		}
		
		// fi 밑에 AA 생성
		File aa = new File(fi, "AA");
		aa.mkdir();
		
		// fi 밑에 BB 생성
		File bb = new File("c:/TEST_IO", "BB");
		bb.mkdir();
	// 실행하면 이그지스트 나오는데 Test_IO가 이미 있어서 그렇다.
		
		// AA 밑에 a.txt 생성
		File a = new File(aa, "a.txt");
		
		// a.createNewFile(); 이라고 쳤더니 빨간줄 뜨면서 오류뜸
		// compile 시 처리해야 하는 예외 = checked exception
		// Unhandled exception type IOException라고 뜸
		// 둘 중 하나 눌러서 해결해 ~! 두번째꺼 누름
		try {
			a.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
}
