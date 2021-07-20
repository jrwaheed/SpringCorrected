package com.example.SpringCorrected;

import com.example.SpringCorrected.Customer;
import org.springframework.data.repository.CrudRepository;


import java.util.List;


public interface Repository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
