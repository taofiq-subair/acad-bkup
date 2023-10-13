package com.management.custmgmt.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.management.custmgmt.repository.JpaCustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.management.custmgmt.model.Customer;

//
//@RequestMapping("api/v1/customers")
//@RestController
//
//@RequiredArgsConstructor
//
//public class CustomerController {
//
//
//    private final CustomerService customerService;
//
//
//    @PostMapping
//    public ResponseEntity<Object> registerCustomer(@RequestBody Customer customer) throws Exception {
//
//         customerService.addCustomer(customer);
//        return new ResponseEntity<>("Customer is created successfully", HttpStatus.CREATED);
//
//
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Customer>> getAllCustomer() {
//        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.CREATED);
//
//    }
//
//    @GetMapping("/{customerId}")
//    public ResponseEntity<Customer> getCustomer(@PathVariable String customerId) {
//        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
//    }
//
//    @PutMapping("/{customerId}")
//    public ResponseEntity<Customer> updateCustomer(@PathVariable String customerId, @RequestBody Customer customer) throws Exception {
//        return new ResponseEntity<>(customerService.updateCustomer(customerId, customer), HttpStatus.OK);
//
//    }
//}

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    JpaCustomerRepo customerRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(@RequestParam(required = false) Long id) {
        try {
            List<Customer> customers = new ArrayList<>();
            customerRepository.findAll().forEach(customers::add);
            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getTutorialById(@PathVariable("id") long id) {
        Optional<Customer> customerData = customerRepository.findById(id);

        if (customerData.isPresent()) {
            return new ResponseEntity<>(customerData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createTutorial(@RequestBody Customer customer) {
        try {

            Customer _customer = customerRepository.save(new Customer( customer.getFullName(), customer.getPhoneNumber(), LocalDateTime.now()));
            System.out.println(_customer);
            System.out.println();
            return new ResponseEntity<>(_customer, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateTutorial(@PathVariable("id") long id, @RequestBody Customer customer) {
        Optional<Customer> tutorialData = customerRepository.findById(id);

        if (tutorialData.isPresent()) {
            Customer _customer = tutorialData.get();
            _customer.setFullName(customer.getFullName());
            _customer.setPhoneNumber(customer.getPhoneNumber());
            _customer.setDateJoined(customer.getDateJoined());
            return new ResponseEntity<>(customerRepository.save(_customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}

