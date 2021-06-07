package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest05 {
	
	// delete
	// 부서 번호 받아서, 삭제하자
	// DELECT FROM DEPT WHERE DEPTNO = ?
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		// 2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		// Connection : 자바와 DB를 연결해주는 객체
		
		// 3. query 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서 번호 : ");
		int deptno = sc.nextInt(); 
				
		String sql = " DELETE FROM DEPT "
				  + " WHERE DEPTNO = " + deptno;
			
		// ▲를 가지고 전달해주는 객체 : Statement 
		Statement stmt = con.createStatement();
				
		// 4. query 실행 및 리턴 
		// 우리가 리턴 받을 타입은 숫자기때문에 int
		int res = stmt.executeUpdate(sql);
		if (res > 0) {
			System.out.println("삭제 성공");
	    } else {
			System.out.println("삭제 실패");
		}
				
				
		// 5. db종료
		stmt.close();
		con.close();
			}
		
		
	}

