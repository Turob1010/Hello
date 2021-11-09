package com.Java.Order.Service.Resource;

import com.Java.Order.Service.Entity.Order;
import com.Java.Order.Service.Service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("/orders")
@Slf4j
public class OrderResource {

    @Autowired
    private OrderService service;
    @PostMapping("/save")
    public Order save (@RequestBody Order order){
        log.info("");
        return service.create(order);
    }
    @GetMapping("/{orderId}")
    public Order getById(@PathVariable Integer orderId){
        log.info("jhvbhg");
        return service.getById(orderId);
    }
    @GetMapping("/all")
    public List<Order> getAll(){
        log.info("");
        return service.getAll();
    }
    @PutMapping("/update")
    public Order update(@RequestBody Order order){
        log.info("");
        Order order1 = service.update(order);
        return order1;
    }
    @DeleteMapping("/delete/{orderId}")
    public void delete (@PathVariable Integer orderId){
        service.delete(service.getById(orderId));

    }



}
