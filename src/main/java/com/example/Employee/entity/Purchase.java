package com.example.Employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="priceDetails")
public class Purchase{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	
	private int cid;
	
	private int pid;
	
	private int quantity;
	
	private double itemPrice;
	
	private double totalAmount;
	
	
	
}
