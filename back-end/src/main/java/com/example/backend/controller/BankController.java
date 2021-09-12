package com.example.backend.controller;

import com.example.backend.model.Bank;
import com.example.backend.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BankController {
    @Autowired
    BankRepository bankRepository;

@GetMapping("/banks")
   public ResponseEntity<List<Bank>> getAllBanks(@RequestParam(required=false) String bankName){
       try {
           List<Bank> banks = new ArrayList<Bank>();
           if (bankName == null)
               bankRepository.findAll().forEach(banks::add);
           else
               bankRepository.findByBankNameContaining(bankName).forEach(banks::add);

           if (banks.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NO_CONTENT);
           }

           return new ResponseEntity<>(banks, HttpStatus.OK);
       } catch (Exception e) {
           return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }


    @GetMapping("/banks/{id}")
    public ResponseEntity<Bank> getBankById(@PathVariable("id") String id) {
        Optional<Bank> bankData = bankRepository.findById(id);

        if (bankData.isPresent()) {
            return new ResponseEntity<>(bankData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/banks")
    public ResponseEntity<Bank> createBank(@RequestBody Bank bank) {
        try {
            Bank _bank = bankRepository.save(new Bank(bank.getBankName()));
            return new ResponseEntity<>(_bank, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/banks/{id}")
    public ResponseEntity<Bank> updateBank(@PathVariable("id") String id, @RequestBody Bank bank) {
        Optional<Bank> bankData = bankRepository.findById(id);

        if (bankData.isPresent()) {
            Bank _bank = bankData.get();
            _bank.setBankName(bank.getBankName());

            return new ResponseEntity<>(bankRepository.save(_bank), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
