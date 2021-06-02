package com.test01;

import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime(); // new안쓰고 다른 걸 씀 : 싱글톤
		
		String path = "notepad.exe";
		
		try {
			Process prc = rt.exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 실행하면 메모장 자동으로 켜진다
		// 프로젝트 오른쪽 클릭 뉴->파일->thread.txt 생성
		
		
}
}
