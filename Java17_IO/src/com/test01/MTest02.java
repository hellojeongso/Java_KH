// 사진이나 파일 업로드할 때 파일 api확인..
package com.test01;

import java.io.File;

public class MTest02 {

	/*
	 * c:\ -> window
	 * /User/dongheon/ -> linux (mac os)
	 */
	 
	public static void main(String[] args) {
		File fi = new File("c:\\");
		// C:\는 이스케이프 문자로 인식한다.

		prnFolder01(fi);
		//prnFolder02(fi);
	}

	private static void prnFolder02(File fi) {
		/*
		 * api:java.base/io/file에서 무슨 메소드를 써야할지 확인
		 * 
		 * 문제 )
		 * 파일과 폴더를 구분해서 출력
		 * ex) 
		 * file : DumpStack.log.tmp
		 * file : hiberfil.sys
		 * dir : Intel
		 * ...
		 * file의 총 갯수 : n개
		 * dir의 총 갯수 : m개
		 *  
		 */
		
		// 파일과 디렉토리 갯수 세기 
		int cntFile = 0;
		int cntDir = 0;
		
		// 파일인지 아닌지 디렉토리인지 아닌지 확인하려면 아래 파일 객체들을 가져와야 한다. 
		// 파일 객체 배열 들에서 파일을 가져오자..?
		for (File file : fi.listFiles()) {
			// 파일인지 아닌지 is로 시작 , 가지고 있는지 아닌지 has
			if (file.isFile()) {
				cntFile++;
				System.out.println("file:" + file);
			} else if(file.isDirectory()) {
				cntDir++;
				System.out.println("dir: " + file);
			}
		}
		
		System.out.println("file의 총 갯수 : " + cntFile + "개");
		System.out.println("dir의 총 갯수 : " + cntDir + "개");
	}

	private static void prnFolder01(File fi) {
		for (String list: fi.list()) {
			System.out.println(list);
		}
	}
}
