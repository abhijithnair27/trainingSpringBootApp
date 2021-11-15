package com.consultadd.training;

import com.consultadd.training.repository.UserRepsitory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepsitory.class)
public class  TrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingApplication.class, args);
	}

}
