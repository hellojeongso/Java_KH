package com.member.biz;

import java.util.List;

import com.member.dto.MemberDto;
import com.member.dao.MemberDao;


// Biz : Business Logic
// 연산, 처리 코드들만 넣어줄 것 
public class MemberBiz {
	
	private MemberDao dao = new MemberDao();
	
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	public MemberDto selectOne(int m_no) {
		
		return dao.selectOne(m_no);
	}
	
	public int insert(MemberDto dto) {
		// return dao.insert(dto); <- 딸랑 이거만 써놓는다면 오류가 발생한다! 
		// M_GENDER -> 대문자 M과 대문자 F만 들어가게 되어있다.
		// 만일 입력된 값이 소문자 m이라면 -> check 제약 조건에 위배
		// m_gender에 저장된 값을 가지고 와서, 대문자로 바꿔서 다시 저장
		dto.setM_gender(dto.getM_gender().toUpperCase());
		
		return dao.insert(dto);
	}
	
	public int update(MemberDto dto) {
		dto.setM_gender(dto.getM_gender().toUpperCase());
		
		return dao.update(dto); 
	
	}
	
	public int delete(int m_no) {
		
		return dao.delete(m_no);
	}
}
