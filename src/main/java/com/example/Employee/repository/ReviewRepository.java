package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.entity.Review;
@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
