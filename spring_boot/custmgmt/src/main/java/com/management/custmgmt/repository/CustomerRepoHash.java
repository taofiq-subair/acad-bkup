package com.management.custmgmt.repository;

import com.management.custmgmt.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class CustomerRepoHash implements CustomerRepository {
    private final Map<Long, Customer> customerMap;

    public CustomerRepoHash(Map<Long, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public void addCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        customerMap.replace(id, customer);
        return customerMap.get(id);
    }

    public Optional<Customer> getCustomerById(Long customerId) {
        return Optional.of(customerMap.get(customerId));
    }
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }
}
