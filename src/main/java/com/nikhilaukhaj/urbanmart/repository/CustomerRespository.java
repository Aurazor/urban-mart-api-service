package com.nikhilaukhaj.urbanmart.repository;

import com.nikhilaukhaj.mongo.model.Customer;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRespository implements PanacheMongoRepository<Customer> {

}
