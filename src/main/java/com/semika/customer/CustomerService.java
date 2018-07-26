/**
 * 
 */
package com.semika.customer;

public interface CustomerService {

	public Iterable<Customer> findAll(); 
	
	public Customer findById(Long id); 
}
