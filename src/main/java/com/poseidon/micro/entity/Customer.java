package com.poseidon.micro.entity;

import com.poseidon.micro.enums.IndexTypeEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author pczhangyu
 * @description document entity
 */
@Document(indexName = IndexTypeEnum.INDEX_NAME, type = IndexTypeEnum.INDEX_TYPE_CUSTOMER, shards = 1, replicas = 0, refreshInterval = "-1")
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    public Customer() {
    }

    public Customer(String id,String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']", this.id,
                this.firstName, this.lastName);
    }

}