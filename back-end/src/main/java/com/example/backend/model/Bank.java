package com.example.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bank")
public class Bank {
    @Id
    private String id;
    private String bankName;

    public Bank(String id, String bankName) {
        this.id = id;
        this.bankName = bankName;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    @Override
    public String toString() {
        return "Bank [id=" + id + ", bankName=" + bankName + "]";
    }
    public Bank(){

    }
}
