package com.example.hajibootrest.api;

import com.example.hajibootrest.domain.Customer;
import com.example.hajibootrest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customers")
public class CustomerRestController {
	@Autowired
	CustomerService customerService;
	
	// 顧客全件取得
	@GetMapping
	Page<Customer> getCustomers(@PageableDefault Pageable pageable) {
		Page<Customer> customers = customerService.findAll(pageable);
		return customers;
	}
	
	//顧客１件取得
	@GetMapping(path = "{id}")
	Optional<Customer> getCustomer(@PathVariable Integer id) {
		Optional<Customer> customer = customerService.findOne(id);
		return customer;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	Customer postCustomers(@RequestBody Customer customer) {
		return customerService.create(customer);
	}
	
	@PutMapping(path = "{id}")
	Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerService.update(customer); 
	}
	
	@DeleteMapping(path = "{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleteCustomer(@PathVariable Integer id) {
		customerService.delete(id);
	}	
	
}
