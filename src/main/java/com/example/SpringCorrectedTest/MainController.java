package com.example.SpringCorrectedTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping (path="/demo")
public class MainController {
    @Autowired



    private Repository repository;


    @PostMapping(path = "/add")
    public @ResponseBody String addNewCustomer(@RequestParam String last_name, @RequestParam String first_name,
                          @RequestParam Integer balance) {
        Customer customer = new Customer();

        customer.setLast_name(last_name);
        customer.setFirst_name(first_name);
        customer.setBalance(balance);

        repository.save(customer);
        return "Saved Down";
    }

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<Customer> getAllCustomers(){

        return repository.findAll();
    }

}
