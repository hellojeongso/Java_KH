package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest04 {

	// update
	// UPDATE DEPT SET DNAME = ?, LOC = ? WHERE DEPTNO = ?
	// 변경할 부서 번호, 변경할 부서 이름, 변경할 부서 위치를 입력받아서 
	// UPDATE를 실행하고 결과를 리턴하자.  (qclass -> kh/강남 -> 서울)
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
		System.out.println("변경할 부서 이름 : ");
		String dname = sc.next();
		System.out.println("변경할 부서 위치 : ");
		String loc = sc.next();
		System.out.println("변경할 번호 : ");
		int deptno = sc.nextInt();
		
		String sql = " UPDATE DEPT "
				  + " SET DNAME = '" + dname + "', "
				  + " LOC = '" + loc + "' "
				  + " WHERE DEPTNO = " + deptno;
		// ▲를 가지고 전달해주는 객체 : Statement 
		Statement stmt = con.createStatement();
		
		// 4. query 실행 및 리턴 
		int res = stmt.executeUpdate(sql);
		if (res > 0) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		
		
		// 5. db종료
		stmt.close();
		con.close();
	}
}
