package tgc.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloTest {

	private Hello hello;

	@Before
	public void init() {
		hello = new Hello();
	}

	@Test
	public void testHello() {
		assertEquals("Hello World!!", hello.sayHello());
	}

}
