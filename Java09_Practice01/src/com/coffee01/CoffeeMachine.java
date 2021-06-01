package com.coffee01;
import java.util.Scanner;
// 돈 받은 만큼 커피를 제조하는 것
public class CoffeeMachine {

	public void inputMoney() {
		System.out.println("돈을 넣어주세요\n1잔당 200원");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		//콘솔창 넣는것 만듬
		
		if (money >=200) {
			makeCoffee(money);
		} else {
			System.out.println("금액이 부족합니다.");
		}
	
	}
	// 돈받는 기능 
	private void makeCoffee(int money) {
		int coffee = money / 200;
		int change = money % 200;
		System.out.println("커피" + coffee + "잔 나왔습니다.");
		System.out.println("잔돈은" + change + "원 입니다.");
	}
}//커피만드는 기능
