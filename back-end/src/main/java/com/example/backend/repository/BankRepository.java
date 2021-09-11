package com.example.backend.repository;

import com.example.backend.model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BankRepository extends MongoRepository<Bank,String> {
    List<Bank> findByBankNameContaining(String bankName);
}
