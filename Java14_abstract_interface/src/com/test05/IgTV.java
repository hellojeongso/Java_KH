package com.test05;
//필드 생성자 메소드형태로 쓴다.
public class IgTV implements TV {
	private int volume;
	
	public IgTV() {
		System.out.println("IgTV가 켜졌습니다");
	}
	
	
	@Override
	public int volumeUp() {
		volume += 3;
		return volume;
	}

	@Override
	public int volumeDown() {
		volume -=3;
		return volume;
	}
	

	public String toString() {
		return "IgTV의 현재 볼륨은 " + volume + "입니다";
	}

}
