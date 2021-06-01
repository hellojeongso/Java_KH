package com.test06;

public class MyProfile extends Profile implements Display, Job {
// Profile 클래스와 Display, Job 인터페이스를 상속받은 클래스
	private String loc;
	
	// MyProfile 에러 : 기본 생성자가 안되는 이유가 뭘까?
	//					부모클래스에서 기본 생성자가 없으므로 자식도 기본생성자가 불가
	// 					부모클래스에서 두개 가졌으니 자식클래스도 두개 
	public MyProfile(String name, String phone) {
		super(name, phone);
		
	}

	// 사실 setter의 기능을 하고 있다. loc값을 초기화 
	@Override
	public void jobLoc(String loc) {
		// this -> 나 "객체"
		// 객체가 되려면 class가 필요한데 this는 myprofile가르킴 
		this.loc=loc;
		// 현재 객체에 String값을 받는다


	

	}

	@Override
	// Display 인터페이스에서 선언된 추상메소드
	public void display() {
		// super => 부모 "객체"....클래스가 있어야함 ! 클래스는 프로필 
		super.printProfile();
		// 다형성 : 슈퍼 클래스(Profile)의 printProfile 메소드를 
		//        재정의하고 회사 주소와 직무 출력 기능을 추가시켰다.
		System.out.println("회사 주소 : " + loc); // 세터로 가져온 loc
		System.out.println("직무 : " + Job_ID); 
		// 앞에 super.Job_ID은 안된다. => 슈퍼는 부모 "객체" 쓰려면 부모 클래스여야한다.
		//							근데 Job_id는 인터페이스꺼 원래는 job.Job_ID로 사용해야한다


	}

}
