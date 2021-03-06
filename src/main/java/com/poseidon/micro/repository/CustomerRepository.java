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

    /**
     * 根据 firstName 查询
     * @param firstName
     * @return
     */
    Customer findByFirstName(String firstName);

    /**
     * 根据 lastName查询
     * @param lastName
     * @return
     */
    List<Customer> findByLastName(String lastName);

}
