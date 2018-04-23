package com.poseidon.micro;

import com.poseidon.micro.entity.Coder;
import com.poseidon.micro.entity.Customer;
import com.poseidon.micro.repository.CoderRepository;
import com.poseidon.micro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

/**
 * @author pczhangyu
 * @description start all
 */
@SpringBootApplication
public class SearchApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CoderRepository coderRepository;

	private void saveCustomers() {
		this.customerRepository.save(new Customer(UUID.randomUUID().toString(),"Alice", "Smith"));
		this.customerRepository.save(new Customer(UUID.randomUUID().toString(),"Bob", "Smith"));
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
		//es run
		this.customerRepository.deleteAll();
		saveCustomers();
		fetchAllCustomers();
		fetchIndividualCustomers();

		//mongodb run
		this.coderRepository.deleteAll();

		// save a couple of customers
		this.coderRepository.save(new Coder(UUID.randomUUID().toString(),"Alice", "Smith"));
		this.coderRepository.save(new Coder(UUID.randomUUID().toString(),"Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Coder coder : this.coderRepository.findAll()) {
			System.out.println(coder);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(this.coderRepository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Coder coder : this.coderRepository.findByLastName("Smith")) {
			System.out.println(coder);
		}

	}
}
