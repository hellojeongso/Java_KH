package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MTest03 {
	
	// insert
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
		System.out.println("부서번호 : ");
		int deptno = sc.nextInt();
		System.out.println("부서이름 : ");
		String dname = sc.next();
		System.out.println("부서위치 : ");
		String loc = sc.next();
		
		String sql = " INSERT INTO DEPT(DEPTNO, DNAME, LOC) "
				+ " VALUES(" + deptno + ", '" + dname + "', '"+ loc + "') ";
		Statement stmt = con.createStatement();
		// 쿼리가 실행되고(자바에서 DB로) 나오는 결과를(DB에서 자바로) 리턴해서 담아주는 객체 
		
		// 4. query 실행 및 리턴
			// ResultSet rs = stmt.executeQuery(sql);
			// ResultSet : 응답되는 결과 테이블을 하나하나 받아줌.
			// cmd창에서 insert 쿼리를 실행해보면 n개의 row created.라고 문구가 뜨는데 n은 숫자. result는 테이블을 리턴하므로 사용 X
		
		// 4-1 SELECT 일 때는, 결과 테이블을 받아줄 ResultSet 사용.
		// ResultSet rs = stmt.excuteQuery(sql);
		// 4-2 INSERT, UPDATE, DELETE 일 때는, 적용된 갯수를 받는다.
		int res = stmt.executeUpdate(sql);
		if (res > 0) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		
		// 5. db종료
		stmt.close();
		con.close();
	}
}

// 50, qclass, 강남
// INSERT INTO DEPT(DEPTNO, DNAME, LOC)
// VALUES(50,'qclass', '강남'); 
