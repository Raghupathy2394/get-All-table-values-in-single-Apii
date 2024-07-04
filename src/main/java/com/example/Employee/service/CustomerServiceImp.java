package com.example.Employee.service;

import java.util.List;
import java.util.Optional;

import com.example.Employee.Dto.CustomerReviewDto;
import com.example.Employee.Dto.PurchaseDetailsDto;
import com.example.Employee.entity.Customer;
import com.example.Employee.entity.Product;
import com.example.Employee.entity.Purchase;

public interface CustomerServiceImp {

	

	Optional<CustomerReviewDto> getMultipleValues(int cid);

	Customer create(Customer customer);

	Product createProduct(Product product);


	Optional<PurchaseDetailsDto> getPurchase(String customerName);

	Purchase createPurchase(Purchase purchase);

}
