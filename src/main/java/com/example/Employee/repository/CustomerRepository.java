package com.example.Employee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Employee.Dto.CustomerReviewDto;
import com.example.Employee.Dto.PurchaseDetailsDto;
import com.example.Employee.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
//	@Query(value="select c.name as CustomerName, c.city as City, "
//			+ "p.productname as ProductName, p.expiryDate as Expirydate, "
//			+ "r.rating as Rating, r.review as Review from customer c "
//			+ "inner join review r on c.cid=r.cid "
//			+ "inner join product p on p.pid=r.pid where c.cid=:c.cid",
//			nativeQuery = true)
	
	@Query(value="select c.name as CustomerName, c.city as City, "
            + "p.product_name as ProductName, p.expiry_date as ExpiryDate, "
            + "r.rating as Rating, r.review_id as ReviewId, r.review as Review "
            + "from customer c "
            + "inner join reviews r on c.cid = r.cid "
            + "inner join product p on p.pid = r.pid "
            + "where r.cid =:cid", 
            nativeQuery = true)
	Optional<CustomerReviewDto> findByGetMultipleValues(int cid);
	
	
	@Query(value="select c.name as Customername, c.mobile_number as MobileNumber, " 
	+"p.product_name as ProductName, p.expiry_date as ExpiryDate, e.bill_id as BillId, " 
				+ "e.quantity as Quantity, e.item_price as ItemPrice, e.total_amount as "
				+ "TotalAmount from customer c "
				+ "inner join  product p on c.cid=p.pid "
			+ "inner join price_details e on p.pid=e.bill_id where c.name=:customerName",nativeQuery=true)
	
	Optional<PurchaseDetailsDto> findByName(String customerName);

}
