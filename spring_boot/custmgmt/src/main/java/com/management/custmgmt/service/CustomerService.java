package com.management.custmgmt.service;
import com.management.custmgmt.model.Customer;
import java.util.*;

public interface CustomerService {


    public void addCustomer(Customer customer) throws Exception;

    public Customer updateCustomer(Long id, Customer customer) throws Exception;

    public Customer getCustomerById(Long customerId) throws Exception;

    List<Customer> getAllCustomers();
}