/**
 * 
 */
package com.semika.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers") 
public class CustomerController {

	@Autowired
	private CustomerService  customerService;
	
	@RequestMapping("/list") 
	public Iterable<Customer> findAll() {
		Iterable<Customer> customers = customerService.findAll();
		return customers;
	}
	
	@RequestMapping("/{id}")
	public Customer findById(@PathVariable Long id) {
		return customerService.findById(id);
	}
}
