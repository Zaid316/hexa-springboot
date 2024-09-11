package com.hexa.example.UserRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.Entities.Bank;



@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
