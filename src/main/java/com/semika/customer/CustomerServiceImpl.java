/**
 * 
 */
package com.semika.customer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Iterable<Customer> findAll() {
		return customerRepository.findAll(); 
	}

	@Override
	public Customer findById(Long id) {
		Optional<Customer>  custOpt = customerRepository.findById(id); 
		
		if (!custOpt.isPresent()) {
			throw new RuntimeException("Customer not found for give Id " + id);
		}
		
		return custOpt.get();
	}

}
