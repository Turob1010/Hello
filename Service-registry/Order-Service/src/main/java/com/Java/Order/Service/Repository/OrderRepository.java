package com.Java.Order.Service.Repository;

import com.Java.Order.Service.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
