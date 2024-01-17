package com.start.st;

import com.start.st.domain.article.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	ArticleService articleService;
	@Test
	void contextLoads2(){
		articleService.create("subject1","content1");

	}
}
