package com.java.concepts.modernjava.java17.records;

class RecordExample {

    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", 999.99);
        System.out.println("Product ID: " + product.id());
        System.out.println("Product Name: " + product.name());
        System.out.println("Product Price: " + product.price());

        Product product1 = new Product(2, "Laptop", 999.99);
        System.out.println("Product ID: " + product.id());
        System.out.println("Product Name: " + product.upperCaseName());
        System.out.println("Product Price: " + product.price());

        try {
            Product product2 = new Product(3, "", -29.99); // throw IllegalArgumentException
            System.out.println("Product ID: " + product2.id());
            System.out.println("Product Name: " + product2.name());
            System.out.println("Product Price: " + product2.price());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Product product4 = new Product(4, "Smartphone"); //using default price of 200.0 in custom compact constructor
        System.out.println("Product ID: " + product4.id());
        System.out.println("Product Name: " + product4.name());
        System.out.println("Product Price: " + product4.price());

        var product5 = new Product(5, "Tablet1", 499.99);
        var product6 = new Product(5, "Tablet2", 499.99);

        System.out.println("product5 equals product6: " + product5.equals(product6)); //true because equals method is overridden to compare only id and price
    }
}