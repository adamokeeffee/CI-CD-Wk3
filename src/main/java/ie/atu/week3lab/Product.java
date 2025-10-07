package ie.atu.week3lab;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor     not working need manual constructors and getters setters

public class Product {
    @NotBlank(message = "No blank names")
    @Size(min = 2, max = 70, message = "Must be between 2 and 70 characters")
    private String productName;
    @Positive
    @DecimalMin(value = "0.01",message = "price must be greater than 1")
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

