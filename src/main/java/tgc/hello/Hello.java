package tgc.hello;

public class Hello {
	public String sayHello() {
		return "Hello!";
	}

	public static void main(String[] args) {
		System.out.println(new Hello().sayHello());
	}
}
