package com.example.productrepository.products.models;
import java.util.Random;


public class IdService {
    private Random random;

    public IdService() {
        random = new Random();
    }

    public int generateRandomId() {
        return random.nextInt();
    }
}