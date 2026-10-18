package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return getAllProducts();
    }

    public void deleteProduct() {
        deleteProduct();
    }

    public List<Product> findByName(String name) {
        return findByName();
    }

    private List<Product> findByName() {
        return findByName();
    }

    public static class productService{
        private static List<Product> products = new ArrayList<>();
        private static Long nextId = 1L;

        public List<Product> getAllProducts() {
            return products;
        }

        public static Product addProduct(Product product) {
            product.setId(nextId++);
            products.add(product);
            return product;
        }

        public static Optional<Product> getProductById(Long id) {
            return products.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst();
        }
        public void deleteProduct(Long id) {
            products.removeIf(p -> p.getId() == id);
        }

        public List<Product> findByName(String name) {
            return products.stream()
                    .filter(p -> p.getName().contains(name))
                    .toList();
        }

    }
}
