package com.jadecross.guestbook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PostTest {

	@Test
	void testSetName() {
		Post post = new Post("TESTER", "2022-05-10 17:42:11", "Happy Wedding");
		post.setName("DEVOPS");
		assertEquals("DEVOPS", post.getName());
	}
}
