package com.smallbaazaar.smallbaazaarapi.interfaces;

import com.smallbaazaar.smallbaazaarapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface loginRepo extends JpaRepository<User,String> {
//    public User save(User user);
    public List<User> findByUsernameAndPassword(String username, String password);
}
