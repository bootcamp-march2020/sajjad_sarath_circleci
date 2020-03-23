package com.example.circleci;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class CircleCiApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
		fail("Fail again");
	}

}
