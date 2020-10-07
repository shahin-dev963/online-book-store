package com.shahin.ecommerce.bookstoreecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shahin.ecommerce.bookstoreecommerce.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
