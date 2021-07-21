package com.example.SpringCorrectedTest;

import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface Repository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
    Customer findCustomerById(int id);
}
