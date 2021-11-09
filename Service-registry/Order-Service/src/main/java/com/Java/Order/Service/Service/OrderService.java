package com.Java.Order.Service.Service;

import com.Java.Order.Service.Entity.Order;
import com.Java.Order.Service.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order create (Order order){
        return orderRepository.save(order);
    }

    public Order getById(Integer orderId){
        return orderRepository.findById(orderId).get();
    }
    public List<Order> getAll(){
        return orderRepository.findAll();
    }

    public Order update(Order order){
        Order order1 = orderRepository.save(order);
        order1.setOrderId(order.getOrderId());
        order1.setOrderName(order.getOrderName());
        order1.setPrice(order.getPrice());
            return order1;
    }

    public void delete(Order order){
        orderRepository.delete(order);
    }
}
