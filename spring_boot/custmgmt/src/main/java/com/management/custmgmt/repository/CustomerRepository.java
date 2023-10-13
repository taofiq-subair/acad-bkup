package com.management.custmgmt.repository;

import com.management.custmgmt.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CustomerRepository {
    void addCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    Optional<Customer> getCustomerById(Long customerId);

    List<Customer> getAllCustomers();

}

