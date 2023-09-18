package com.example.productrepository.products.models;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class IdService {

    public String randomId(){
        return UUID.randomUUID().toString();
    }
}