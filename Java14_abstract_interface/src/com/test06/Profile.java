package com.test06;

public class Profile {

	private String name;
	private String phone;
	
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	// 파라미터 2개짜리 생성자와
	// 첫번째 파라미터 받아서 첫번째 값에 저장하고. 필드를 초기화 (위로 string name간다) 
	// 두번째 파라ㅁㅣ터받아서 두번째 값에 저장하고 필드를 초기화
	
	public void printProfile() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		
	// 메소드
	}
}
