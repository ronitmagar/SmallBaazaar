package com.smallbaazaar.smallbaazaarapi.services;

import com.smallbaazaar.smallbaazaarapi.entities.User;
import com.smallbaazaar.smallbaazaarapi.interfaces.loginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginService {
    @Autowired
    loginRepo repository;

    public void saveUser(User user) {
         repository.save(user);
    }
   /* public User saveUser(User user) {
        return repository.save(user);
    }*/
    public List<User> getUser(String username, String password) {
        return repository.findByUsernameAndPassword(username, password);
    }
}
