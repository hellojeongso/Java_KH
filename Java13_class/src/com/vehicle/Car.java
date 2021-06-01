package com.vehicle;

public class Car {
	
	private int speed; 
	// private car 클래스 내부에서만 사용 가능하다.
	// 그래서 게터와 세터를 이용하여 부모 메소드 사용 가능하다. 
	
	public Car() {
	}
	public Car(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void accelPedal() {
		System.out.println("속도가 올라갑니다.");
		speed += 10;
	}
	public void breakPedal() {
		speed -= 10;
		if (speed > 0) {
			System.out.println("속도가 줄어듭니다.");
		} else {
			System.out.println("멈췄습니다.");
			speed = 0;
		}
	}
	
	@Override
	public String toString() {
		return "현재 속도는" + speed + "입니다."; 
	
		}
	

}

