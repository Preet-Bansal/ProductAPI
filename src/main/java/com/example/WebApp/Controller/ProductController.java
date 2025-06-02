package com.example.WebApp.Controller;

import com.example.WebApp.Model.Product;
import com.example.WebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller class
@RestController //Rest controller annotations return the data @controller annotation return the page
public class ProductController {

    @Autowired  // auto wiring the service class dependency
    ProductService productService;

    //getting all the products using return type list<product> bcz it will return list of products
    @GetMapping("/products")
    public List<Product> getProduct(){

        return productService.getProducts();
    }

    //getting products by id return type is product bcz it will return one product
    // path variable to give the variable in the url path. in this case searching with prodId
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){

        return productService.getProductById(prodId);
    }

    //adding the products
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }

}
