package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class MTest05 {
	public static void main(String[] args) {
		File fi = new File("b.txt");

		MyOutput(fi);
		MyInput(fi);
	}

	private static void MyInput(File fi) {
		try (FileReader fr = new FileReader(fi);) {

			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.println((char) ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	private static void MyOutput(File fi) {

		// try with resources : try의 괄호 안에, close를 해야하는 명령문을 작성하면 close
		try (FileWriter fw = new FileWriter(fi);) {

			fw.write("연습중입니다.");
			fw.append("abcd\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}