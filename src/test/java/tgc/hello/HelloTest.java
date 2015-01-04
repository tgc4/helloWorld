package tgc.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello() {
		final Hello hello = new Hello();
		assertEquals("Hello World!", hello.sayHello());
	}

}

