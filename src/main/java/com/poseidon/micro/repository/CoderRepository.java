package com.poseidon.micro.repository;

import com.poseidon.micro.entity.Coder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author pczhangyu
 * @date 2018/4/23
 * @description elasticsearch CustomerRepository
 */
public interface CoderRepository extends MongoRepository<Coder,String> {

    /**
     * 根据 firstName 查询
     * @param firstName
     * @return
     */
    Coder findByFirstName(String firstName);

    /**
     * 根据 lastName查询
     * @param lastName
     * @return
     */
    List<Coder> findByLastName(String lastName);

}
