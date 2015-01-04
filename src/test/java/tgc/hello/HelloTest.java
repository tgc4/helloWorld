package tgc.hello;

import static org.junit.Assert.*;

import org.junit.Test;

import tgc.hello.Hello;

public class HelloTest {

	@Test
	public void testHello() {
		Hello hello = new Hello();
		assertEquals("Hello World!", hello.sayHello());
	}

}
