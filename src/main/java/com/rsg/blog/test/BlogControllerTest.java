package com.rsg.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.rsg.blog 패키지 이하를 스ㅐㄴ해서 모든 파일을 메모리에 new 하는것이 아닌
// 특정 이노테이션이 분어있는 클래스 파일을 new해서(loC) 스프링 컨테이너에 관리
@RestController
public class BlogControllerTest {
	@GetMapping("test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
