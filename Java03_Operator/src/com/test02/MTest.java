package com.test02;

public class MTest {
	public static void main(String []args) {
		Fruitbasket.bananaBasket = new Fruitbasket();
		bananaBasket.basketSetting("바나나", 10);
		bananaBasket.fruitCount = 50;
		System.out.println(bananaBasket.fruitCount);
		// bananaBasket.basketSize = 100;
		FruitBasket.basketSize = 100;
		System.out.println(bananaBasket.basketSize);
		
		FruitBasket appleBasket = new FruitBasket();
		appleBasket.basketSetting("사과",30);
		System.out.println(appleBasket.fruitCount);
		System.out.println(appleBasket.basketSize);
	}
}