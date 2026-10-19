package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public ProductService() {
        products.add(new DigitalProduct(nextId++, "Assasins Creed 2", 26.99, "ubisoft.com/assasins", 50000));
        products.add(new PhysicalProduct(nextId++,"RTX 6000 pro", 1500.99, 1.2, "20 * 40"));

    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream().filter(p -> p.getName().contains(name)).toList();
    }
}
