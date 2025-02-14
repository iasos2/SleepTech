package chapter04;

class Person{
	String name;
	int age;
	static int population;
	
	Person(){
		population++;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		population++;
	}
	void introduce() {
		System.out.println("안녕하세요, 저는" + name + "이고, 나이는" + age + "살 입니다");
	} 
}
public class H_PP {
	public static void main(String[] args) {
		Person honggildong = new Person("홍길동", 20);
		
		honggildong.introduce(); // 안녕하세요, 저는홍길동이고, 나이는20살 입니다
		
		System.out.println(Person.population); // 1
		
		new Person();
		new Person();
		new Person();
		new Person();
		new Person();

		System.out.println(Person.population); // 6
	}

}
