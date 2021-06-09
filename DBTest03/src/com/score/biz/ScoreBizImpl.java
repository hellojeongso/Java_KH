package com.score.biz;

import com.score.dao.ScoreDao;
import com.score.dao.ScoreDaoimpl;

import java.util.List;

import com.score.dto.ScoreDto;


public class ScoreBizImpl implements ScoreBiz {
	
	private ScoreDao dao = new ScoreDaoimpl();

	@Override
	public List<ScoreDto> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public ScoreDto selectOne(String s_name) {
		// TODO Auto-generated method stub
		return dao.selectOne(s_name);
	}

	@Override
	public int insert(ScoreDto dto) {
		int sum = getSum(dto.getS_kor(), dto.getS_eng(), dto.getS_math());
		double avg = getAvg(sum);
		String grade = getGrade(avg);
		
		dto.setS_sum(sum);
		dto.setS_avg(avg);
		dto.setS_grade(grade);
		
		return dao.insert(dto);
	}

	@Override
	public int update(ScoreDto dto) {
		// insert랑 같은데 모양만 좀 다르게 할 것
		dto.setS_sum(getSum(dto.getS_kor(), dto.getS_eng(), dto.getS_math()));
		dto.setS_avg(getAvg(dto.getS_sum())); // ▲ 위에서 저장된 값(S_sum)을 다시 가지고 와서 연산 
		dto.setS_grade(getGrade(dto.getS_avg()));
		
		return dao.update(dto);
		// dto에게 전달
	}

	@Override
	public int delete(String s_name) {
		// TODO Auto-generated method stub
		return dao.delete(s_name);
	}

	
	
	
	
	
	public int getSum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	public double getAvg(int sum) {
		return sum / 3.0;
	}
	public String getGrade(double avg) {
		switch((int)avg/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}

	@Override
	public ScoreDto topNproc(int n) {
		return dao.topNproc(n);
	}
}
