package com.Java.User.Service.Service;

import com.Java.User.Service.Entity.User;
import com.Java.User.Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User create (User user){
        User user1 = userRepository.save(user);
        return user1;
    }

    public User getById(Integer userId){
        return userRepository.findById(userId).get();
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User update(User user){
      User user1 = userRepository.save(user);
      user1.setUserId(user.getUserId());
      user1.setUserName(user.getUserName());
      user1.setAge(user.getAge());
      user1.setOrderId(user.getOrderId());
        return user1;
    }

    public void delete (User user){
        userRepository.delete(user);
    }

}
