/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentistapp.dentistapp.repository;

import com.dentistapp.dentistapp.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ricardo
 */
@Repository
public interface UserRepository extends MongoRepository<User, Long>{
    
    User findByUsernameAndPassword(String username, String password);
    
    User findByUsername(String username);
    
}
