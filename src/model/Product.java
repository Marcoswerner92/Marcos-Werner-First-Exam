package model;
import java.util.UUID;


    public abstract class Product {
        protected UUID ID;
        protected String name;
        protected Double price;
        protected Integer stock;
        protected ProductType type;


        public Product(UUID ID, String name, Double price, Integer stock, ProductType type) {
            this.ID = UUID.randomUUID();
            this.name = name;
            this.price = price;
            this.stock = stock;
            this.type = type;
        }

        // There is no need of setter for ID, it´s automatically generated.

        public UUID getID() {
            return ID;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }

        public ProductType getType() {
            return type;
        }

        public void setType(ProductType type) {
            this.type = type;
        }
    }

    public Double calculatePrice(Double percentage) {
        return null;
    }
}
