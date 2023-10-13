package com.interswitch.springapp.controller;

import com.interswitch.springapp.model.Product;
import com.interswitch.springapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @RequestMapping(value = "products/")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "products/{id}/")
    public ResponseEntity<Object> getProducts(@PathVariable String id){
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @RequestMapping(value = "products/", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "products/{id}/", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "products/{id}/", method = RequestMethod.DELETE)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
    }
}
