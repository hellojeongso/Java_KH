package com.test06;

public interface Job {
	
	// 인터페이스 안에서의 변수는 자동으로 상수화 = static final 
	// 상수란 변하지 않는 수, 고정된 수 
	public String Job_ID = "IT";
	//Job_ID = "Singer"; <- 불가능하다. singer라는 값은 할당될 수 없다. final이라서
	public void jobLoc(String loc);
}
