package com.management.custmgmt.service.impl;

import com.management.custmgmt.model.Customer;
import com.management.custmgmt.repository.CustomerRepository;
import com.management.custmgmt.repository.JpaCustomerRepo;
import com.management.custmgmt.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

import org.springframework.stereotype.Repository;

@Service
@RequiredArgsConstructor

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    @Override
    public void addCustomer(Customer customer) throws Exception {
validatePhoneNumber(customer.getPhoneNumber());
customer.setDateJoined(LocalDateTime.now());
customerRepository.addCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) throws Exception {
        Optional<Customer> existingCustomer = customerRepository.getCustomerById(id);
        if(existingCustomer.isEmpty()){
            throw new Exception("Customer does not exist");
        }
        if(customer.getFullName() != null){
            existingCustomer.get().setFullName(customer.getFullName());
        }
        if(customer.getPhoneNumber() != null){
            validatePhoneNumber(customer.getPhoneNumber());
            existingCustomer.get().setPhoneNumber(customer.getPhoneNumber());
        }
        return customerRepository.updateCustomer(id, existingCustomer.get());
    }

    @Override
    public Customer getCustomerById(Long customerId) throws Exception {
Optional<Customer> customer = customerRepository.getCustomerById(customerId);
        if(customer.isEmpty()){
            throw new Exception("Customer does not exist");
        }
        return customer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    private void validatePhoneNumber(String phoneNumber) throws Exception {
        List<Customer> customer = customerRepository.getAllCustomers();
        for (Customer c : customer) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                throw new Exception("Phone number already exists");
            }
        }
    }
}


//        CustomerService(CustomerRepository customerRepository){
//        this.customerRepository = customerRepository;
//    }
//
//    private Map<Long, Customer> customerMap;
//
//    {
//        customerMap = new HashMap<>();
//    }
//
//    public void addCustomer(Customer customer) throws Exception {
//        if (!customerMap.containsKey(customer.getId()) && !phoneNumberExists(customer.getPhoneNumber())) {
//            customer.setDateJoined(LocalDateTime.now());
//            customerMap.put(customer.getId(), customer);
//        } else {
//            throw new Exception("Customer ID or Phone Number already exists! Try again..");
//        }
//    }
//
//    public Customer updateCustomer(String id, Customer customer) {
//        if (customerMap.containsKey(id)) {
//            customerMap.put(customer.getId(), customer);
//            return customerMap.get(id);
//        } else {
//            throw new IllegalArgumentException("Customer ID not found.");
//        }
//    }
//
//    public Customer getCustomerById(String customerId) {
//        return customerMap.get(customerId);
//    }
//
//    public List<Customer> getAllCustomers() {
//        return new ArrayList<>(customerMap.values());
//    }
//
//    private boolean phoneNumberExists(String phoneNumber) throws RuntimeException {
//        try {
//            for (Customer customer : customerMap.values()) {
//                if (customer.getPhoneNumber().equals(phoneNumber)) {
//                    return true;
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return false;
//    }
//
//
//    private void deleteCustomer(String id){
//        if(customerMap.containsKey(id)){
//            customerMap.remove(id);
//        }
//    }