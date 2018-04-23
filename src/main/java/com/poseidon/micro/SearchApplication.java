package com.poseidon.micro;

import com.poseidon.micro.entity.Customer;
import com.poseidon.micro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author pczhangyu
 * @description start all
 */
@SpringBootApplication
public class SearchApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;

	private void saveCustomers() {
		this.customerRepository.save(new Customer("Alice", "Smith"));
		this.customerRepository.save(new Customer("Bob", "Smith"));
	}

	private void fetchAllCustomers() {
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : this.customerRepository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
	}

	private void fetchIndividualCustomers() {
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(this.customerRepository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : this.customerRepository.findByLastName("Smith")) {
			System.out.println(customer);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, "--debug").close();
	}

	@Override
	public void run(String... strings) throws Exception {
		this.customerRepository.deleteAll();
		saveCustomers();
		fetchAllCustomers();
		fetchIndividualCustomers();
	}
}
