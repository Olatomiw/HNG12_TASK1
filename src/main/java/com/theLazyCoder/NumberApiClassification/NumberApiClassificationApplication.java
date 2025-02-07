package com.theLazyCoder.NumberApiClassification;

import com.theLazyCoder.NumberApiClassification.service.NumberClassificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.theLazyCoder.NumberApiClassification.service.NumberClassificationService.is_perfect_number;

@SpringBootApplication
public class NumberApiClassificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberApiClassificationApplication.class, args);
		NumberClassificationService numberClassificationService = new NumberClassificationService();
		numberClassificationService.classifyNumber(100);
		is_perfect_number(28);
	}

}
