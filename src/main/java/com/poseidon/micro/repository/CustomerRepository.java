package com.poseidon.micro.repository;

import com.poseidon.micro.entity.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author pczhangyu
 * @date 2018/4/23
 * @description elasticsearch CustomerRepository
 */
public interface CustomerRepository extends ElasticsearchRepository<Customer,String>{

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

}
