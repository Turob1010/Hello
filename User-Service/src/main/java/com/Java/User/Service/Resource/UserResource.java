package com.Java.User.Service.Resource;

import com.Java.User.Service.Entity.User;
import com.Java.User.Service.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserResource {
    @Autowired
    private UserService service;
    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser method of UserResource");
        return service.create(user);
    }
    @GetMapping("/{userId}")
    public User getById(@PathVariable Integer userId){
        log.info("Inside getById method of UserResource");
        return service.getById(userId);
    }
    @GetMapping("/all")
    public List<User> getAll(){
        log.info("Inside getAll method of UserResource");
        return service.getAll();
    }
    @PutMapping("/update")
    public User update(@RequestBody User user){
        log.info("Inside update method of UserResource");
        User user1 = service.update(user);
        return user1;
    }
    @DeleteMapping("/delete/{userId}")
    public void  delete(@PathVariable Integer userId) {
        log.info("Inside delete method of UserResource");
        service.delete(service.getById(userId));
    }

}
