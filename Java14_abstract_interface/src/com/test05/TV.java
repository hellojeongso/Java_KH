package com.test05;

public interface TV {
	
	
	int volumeUp();
	int volumeDown();
	
	/*
	 * lgTV 클래스를 만들자
	 * - private int volume; 만들고
	 * - volumeUp() 메소드에서는 현재 볼륨에 +3;
	 * - volumeDown() 메소드에서는 현재 볼륨에 -3;
	 * - toString() 메소드에서는 "lgTV의 현재 볼륨은 n입니다."
	 * - 생성자가 호출될 시, "lg TV가 켜졌습니다."
	 * 
	 * Samsong TV 클래스를 만들자
	 * - private int volume; 만들고
	 * - volumeUp() 메소드에서는 현재 볼륨에 +5;
	 * - volumeDown() 메소드에서는 현재 볼륨에 -5;
	 * - toString() 메소드에서는 "Samsong TV의 현재 볼륨은 n입니다."
	 * - 생성자가 호출될 시, "Samsong TV가 켜졌습니다."
	 * 
	 */
}
