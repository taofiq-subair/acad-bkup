package com.management.custmgmt.repository;

import com.management.custmgmt.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public class JpaCustomerRepo implements CustomerRepository {

    private final JpaRepository<Customer, Long> jpaRepository;


    public JpaCustomerRepo(JpaRepository<Customer, Long> jpaRepository) {
        this.jpaRepository = jpaRepository;
    }
    @Override
    public void addCustomer(Customer customer) {
         jpaRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
//        var retrievedCustomer = jpaRepository.findById(id).orElseThrow(
//                ()-> new RuntimeException("Customer not found")
//        );
//        retrievedCustomer.setFullName(customer.getFullName());
      return   jpaRepository.save(customer);
//        return retrievedCustomer;
    }

    @Override
    public Optional<Customer> getCustomerById(Long customerId) {
        return jpaRepository.findById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return jpaRepository.findAll();
    }
}
