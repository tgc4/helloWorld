package tgc.hello;

public class Hello {

	private static final String GREETINGS_MSG = "Hello World!";

	public String sayHello() {
		return GREETINGS_MSG;
	}

	public static void main(String[] args) {
		System.out.println(new Hello().sayHello());
	}
}
