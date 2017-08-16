package cart;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sku;
    private String name;
    private float price;
}
