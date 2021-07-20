package com.example.SpringCorrected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping (path="/demo")
public class MainController {
    @Autowired

    private Repository repository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewCustomer(@RequestParam String lastName, @RequestParam String firstName,
                          @RequestParam Integer balance) {
        Customer customer = new Customer();
        customer.setLastName(lastName);
        customer.setFirstName(firstName);
        customer.setBalance(balance);
        repository.save(customer);
        return "Saved Down";
    }

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<Customer> getAllCustomers(){
        //logger.info("getAllCustomers method entered");
        return repository.findAll();
    }

}
