package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void checkName() {
		MessageService service = new MessageService();
		String result = service.sayHello("Kai");
		
		assertEquals(result, "Hello World Kai");
	}

}
