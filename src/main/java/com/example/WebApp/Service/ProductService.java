package com.example.WebApp.Service;

import com.example.WebApp.Model.Product;
import com.example.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

//    List<Product> prod = new ArrayList<>(Arrays.asList(new Product(101, "phone", 50000),
//                                        new Product(102, "camera", 1000),
//                                        new Product(102, "mouse", 900)));


    public List<Product> getProducts(){

        return productRepo.findAll();
    }

    public Product getProductById(int prodId) {
//        return prod.stream()
//                .filter(p-> p.getProdId()==prodId)
//                .findFirst().get();

        return productRepo.findById(prodId)
                          .orElse(new Product());
    }

    public void addProduct(Product product){

       // prod.add(product);
        productRepo.save(product);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProduct(int prodId){
        productRepo.deleteById(prodId);
    }


}
