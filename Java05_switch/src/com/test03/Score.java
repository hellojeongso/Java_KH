package com.test03;

public class Score {
	
	static double getAvg(int kor, int eng, int math) {
		
		double res = 0;
		
		// int sum = kor + eng + math;
		// res = (double) (kor + eng + math) / 3;
		// res = (double) (kor+eng+math)/3;라고 적어놓고 리ㅓ턴함 뭔소린지..?
		
		return (double) (kor+eng+math)/3;
		// 빨간줄 뜨기싫어서 미리 리턴에 0 써놈 초기값
		
		
		}
	
	public static String getGrade(double avg) {
		switch((int)avg/10) {
			// 정수형, 문자형, 문자열밖에 안들어가니까 실수형을 정수로 바꿔버린거고
			// 평균 구하는데 앞 숫자만 맞추면되니까 10짜리로 
			// 여기선 브레이크 안써도 됨 리턴이 있으니까 
			// 해당메소드의 명령문들을 수행하고 리턴되는 값이 스트링이다
			// 리턴이잇어서 쭉 못내려감 
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default : 
				return "F";
		}
	
	}
	
	
}
