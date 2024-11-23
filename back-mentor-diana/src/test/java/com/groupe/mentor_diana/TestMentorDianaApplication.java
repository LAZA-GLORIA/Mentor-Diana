package com.groupe.mentor_diana;

import org.springframework.boot.SpringApplication;

public class TestMentorDianaApplication {

	public static void main(String[] args) {
		SpringApplication.from(MentorDianaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
