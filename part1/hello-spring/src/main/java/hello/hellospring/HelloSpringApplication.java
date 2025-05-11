package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		System.out.println("part1.스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술");
	}

}
