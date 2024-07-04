package com.example.Employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Dto.CustomerReviewDto;
import com.example.Employee.Dto.PurchaseDetailsDto;
import com.example.Employee.entity.Customer;
import com.example.Employee.entity.Product;
import com.example.Employee.entity.Purchase;
import com.example.Employee.service.CustomerServiceImp;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerServiceImp serviceImp;
	
	@GetMapping("/getMultipleValues")
	public Optional<CustomerReviewDto> getMultiple(@RequestParam(value="customerId") int cid){
		return serviceImp.getMultipleValues(cid);
	}

 @PostMapping("/postCustomer")
public Customer create(@RequestBody Customer customer) {
	return serviceImp.create(customer);
}
@PostMapping("/postProduct")
public Product createProduct(@RequestBody Product product) {
	return serviceImp.createProduct(product);
}
@PostMapping("/postPurchase")
public Purchase createPurchase(@RequestBody Purchase purchase) {
	return serviceImp.createPurchase(purchase);

}
@GetMapping("/getPurchase")
public Optional<PurchaseDetailsDto> getPurchase(@RequestParam(value="customerName") String CustomerName){
	return serviceImp.getPurchase(CustomerName);
}
}














