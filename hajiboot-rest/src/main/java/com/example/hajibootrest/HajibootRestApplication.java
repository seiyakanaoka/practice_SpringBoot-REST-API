package com.example.hajibootrest;
//
//import com.example.hajibootrest.domain.Customer;
import com.example.hajibootrest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class HajibootRestApplication {
//
//	@Autowired
//	CustomerRepository customerRepository;
//	
//	@Override
//	public void run(String... strings) throws Exception {
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		System.out.println();
//		Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
//		
//		System.out.println(created + "is created!");
//		
//		customerRepository.findAllOrderByName().forEach(System.out::println);;
//		
//		System.out.println();
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//	} 

	public static void main(String[] args) {
		SpringApplication.run(HajibootRestApplication.class, args);
	}
}