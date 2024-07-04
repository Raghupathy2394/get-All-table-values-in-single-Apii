package com.example.Employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Dto.CustomerReviewDto;
import com.example.Employee.Dto.PurchaseDetailsDto;
import com.example.Employee.entity.Customer;
import com.example.Employee.entity.Product;
import com.example.Employee.entity.Purchase;
import com.example.Employee.repository.CustomerRepository;
import com.example.Employee.repository.ProductRepository;
import com.example.Employee.repository.PurchaseRepository;
import com.example.Employee.repository.ReviewRepository;

@Service
public class CustomerService implements CustomerServiceImp {

	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@Autowired
	PurchaseRepository purchaseRepo;


	@Override
	public Optional<CustomerReviewDto> getMultipleValues(int cid) {
		return customerRepo.findByGetMultipleValues(cid);
	}

	@Override
	public Customer create(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public Product createProduct(Product product) {
	
		return productRepo.save(product);
	}

	@Override
	public Purchase createPurchase(Purchase purchase) {
	Purchase obj=new Purchase();
	obj.setCid(purchase.getCid());
	obj.setPid(purchase.getPid());
	obj.setItemPrice(purchase.getItemPrice());
	obj.setQuantity(purchase.getQuantity());
	obj.setTotalAmount(purchase.getItemPrice()*purchase.getQuantity());
		return purchaseRepo.save(obj);
	}
	
	@Override
	public Optional<PurchaseDetailsDto> getPurchase(String customerName) {
		return customerRepo.findByName(customerName);
	}
	
	

}
