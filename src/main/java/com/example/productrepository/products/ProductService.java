package com.example.productrepository.products;

import com.example.productrepository.products.models.NewProduct;
import com.example.productrepository.products.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(NewProduct newProduct) {

        Product product = new Product(
                UUID.randomUUID().toString(),
                newProduct.title(),
                newProduct.price()
                );

        return productRepository.save(product);
    }
    public Product findById(String id){
        return productRepository.findById(id).orElseThrow();
    }
}
