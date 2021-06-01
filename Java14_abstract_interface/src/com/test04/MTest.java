package com.test04;

public class MTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("육포");
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("새");
		eagle.fly();
		
		// 앞에 Eagle을 Animal로 변경하면 fly를 상속받지 못한다. (Animal 타입이 아니라서)
		// 그래서 하고 싶다면 Eagle을 Animal로 변경한 후에 eagle.fly 앞에 있는 오류를 클릭해서
		// (eagle)로 타입을 변환한다. 

	}

}
