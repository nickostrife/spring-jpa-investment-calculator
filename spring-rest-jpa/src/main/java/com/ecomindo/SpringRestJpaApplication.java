package com.ecomindo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecomindo.example.InputForm;
import com.ecomindo.example.InputFormRepository;

@SpringBootApplication
public class SpringRestJpaApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringRestJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(InputFormRepository repository) {
		return (args) -> {
//			// save a couple of customers
//			repository.save(new InputForm(1, "Hi", "Jack", "Bauer"));
//			repository.save(new InputForm(2, "Hi", "Chloe", "O'Brian"));
//			repository.save(new InputForm(3, "Hi", "Kim", "Bauer"));
//			repository.save(new InputForm(4, "Hello", "David", "Palmer"));
//			repository.save(new InputForm(5, "Hello", "Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (InputForm inputForm : repository.findAll()) {
//				log.info(inputForm.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			repository.findById((long) 2)
//				.ifPresent(customer -> {
//					log.info("Customer found with findById(2L):");
//					log.info("--------------------------------");
//					log.info(customer.toString());
//					log.info("");
//				});
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
//			log.info("");
		};
	}

}
