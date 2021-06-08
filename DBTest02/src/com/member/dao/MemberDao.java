package com.member.dao;

import static com.member.db.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.member.dto.MemberDto;

// Dao : Data Access Object
// db와 연결하는 코드만 작성 jdbc라는 얘기! 
public class MemberDao {

	public List<MemberDto> selectList() {
		// 1.
		// 2. 1번과 2번은 아까 미리 만들어 놔서 호출만 하면 된다. 
		// import static을 하면 Class.method에서 Class.이 생략이 가능하다 
		// Connection con = JDBCTemplate.getConnection(); <- JDBCTemplate 생략된 모습
		Connection con = getConnection();
		
		// 3.
		String sql = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL "
				   + " FROM MEMBER "
				   + " ORDER BY M_NO DESC ";
		
		Statement stmt = null;
		ResultSet rs = null;
		// SELECT 쿼리니까 TABLE이 리턴될 것이고(Statement), 해당 테이블을 받을 수 있는 그릇이 필요하다.(ResultSet)
		
		List<MemberDto> list = new ArrayList<MemberDto>(); // 이 값을 리턴할거임
		
		try {
			stmt = con.createStatement();
			
			// 4. 
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// 여기에 address처럼 syso를 해서 view를 만들면 안됨. 이 클래스는 db만 연결하는 코드만 작성해야한다. 
				// 그러나 ResultSet에 담긴 값을 어디에 담아야한다. 아까 테이블에 row 한줄의 값을 담을 수 있는 객체 dto를 만들어놨다.
				// ▲ 맨 위 코드를 보면 list로 만들어서 값이 여러개 나올텐데, 여러 개의 값을 효과적으로 관리할 수 있는 객체를 사용한다.
				// 그 중에서 list를 사용할 것. 순서대로 들어온 것 순서대로 저장되고 순서대로 출력되니까. 
				// try구문 위에 list 만들어놨음
			MemberDto dto = new MemberDto();
			dto.setM_no(rs.getInt(1));
			dto.setM_name(rs.getString(2));
			dto.setM_age(rs.getInt(3));
			dto.setM_gender(rs.getString(4));
			dto.setM_location(rs.getString(5));
			dto.setM_job(rs.getString(6));
			dto.setM_tel(rs.getString(7));
			dto.setM_email(rs.getString(8));
			
			list.add(dto); // ▲ 위 값을 가져온 다음에 list에 담아줄거야 
		}
					
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		// 5. 
		close(rs);
		close(stmt);
		close(con);
	}
		return list;
	}
	
	// ▽ 번호 기준으로 메소드 만들기
	// 선택출력 : 이 쿼리를 보내면 row값이 담긴 테이블이 리턴된다.? biz에게 
	// 셀렉트라 where조건에 의해서 조건에 맞는 한줄의 row값이 담긴 테이블이 전달됐는데 그걸 biz에게 전해 줄때 dto에 담아줄 것 
	public MemberDto selectOne(int m_no){
		// 1. 
		// 2.
		Connection con = getConnection();
		// 3.
		String sql = " SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL "
				  + " FROM MEMBER "
				  + " WHERE M_NO = ? ";
		PreparedStatement pstm = null;
		ResultSet rs = null; 
		
		MemberDto dto = null; 
		
		try {
			pstm = con.prepareStatement(sql);
			pstm. setInt(1, m_no);
			
			// 4.
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto = new MemberDto();
				dto.setM_no(rs.getInt("M_no"));
				dto.setM_name(rs.getString("M_NAME"));
				dto.setM_age(rs.getInt("M_AGE"));
				dto.setM_gender(rs.getString("M_GENDER"));
				dto.setM_location(rs.getString("M_LOCATION"));
				dto.setM_job(rs.getString("M_JOB"));
				dto.setM_tel(rs.getString("M_TEL"));
				dto.setM_email(rs.getString("M_EMAIL"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.
			close(rs);
			close(pstm);
			close(con);
		}
		
		return dto; // dto 리턴하는 이유 : row 한줄의 값을 넣어서 저장했기때문에 
	}
	// 추가는 7개 값을 받ㄷ아와하는데 리턴값이 int로 해준다 이유는...  
	public int insert(MemberDto dto) {
		// 1.
		// 2.
		Connection con = getConnection();
		
		// 3.
		String sql = " INSERT INTO MEMBER "
				  + " VALUES (MEMBERSEQ.NEXTVAL, ? ,?, ?, ?, ?, ?, ?) ";
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());
		
		// 4.
		res = pstm.executeUpdate();
		if (res > 0) {
			commit(con);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		// 5.
		close(pstm);
		close(con);
	}
		return res;
	}
	
	// 수정
	public int update(MemberDto dto) {
		// 1.
		// 2.
		Connection con = getConnection();
		
		// 3.
		String sql = " UPDATE MEMBER "
				+ " SET M_NAME = ?, M_AGE = ?, M_GENDER = ?, M_LOCATION = ?, "
				+ " M_JOB = ?, M_TEL = ?, M_EMAIL = ? "
				+ " WHERE M_NO = ? ";
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2,  dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6,  dto.getM_tel());
			pstm.setString(7,  dto.getM_email());
			pstm.setInt(8, dto.getM_no());
		
		// 4.
			res = pstm.executeUpdate(); // n개의 row가 업데이트 됐다. 
			if (res > 0) {				// res가 0보다 크다면 커밋하자! 
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}
	// 삭제
	public int delete(int m_no) {
		// 1.
		// 2.
		Connection con = getConnection();
		
		// 3.
		String sql = " DELETE FROM MEMBER " 	// 여기부터
				 + " WHERE M_NO = ? ";
		PreparedStatement pstm = null;
		int res = 0;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,  m_no);		// 여기까지 쿼리 준비  // 프리컴파일드?미리값을가지고있는다?
		
			// 4. 
			res = pstm.executeUpdate();
			if (res > 0) {		// 삭제할 로우의 갯수가 0보다 크다면 성공
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.
			close(pstm);
			close(con);
		}
		return res;
	}
	
	
}
