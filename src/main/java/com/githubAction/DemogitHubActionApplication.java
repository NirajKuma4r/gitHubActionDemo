package com.githubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemogitHubActionApplication {

	@GetMapping("/showmessage")
	public String showWelcomeMessage() {
		return "Welcome in GitHubAction";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemogitHubActionApplication.class, args);
	}

}
