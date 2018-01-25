package com.example.demo.dto;

public class ProductDTO {

    private long product_id;
    private String product_name;
    private float product_price;
    private String product_imageURL;
    private int product_count;
    private String product_barcodeNumber;
    boolean product_is_favourited;

    public ProductDTO() {
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_imageURL='" + product_imageURL + '\'' +
                ", product_count=" + product_count +
                ", product_barcodeNumber='" + product_barcodeNumber + '\'' +
                ", product_is_favourited=" + product_is_favourited +
                '}';
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_imageURL() {
        return product_imageURL;
    }

    public void setProduct_imageURL(String product_imageURL) {
        this.product_imageURL = product_imageURL;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    public String getProduct_barcodeNumber() {
        return product_barcodeNumber;
    }

    public void setProduct_barcodeNumber(String product_barcodeNumber) {
        this.product_barcodeNumber = product_barcodeNumber;
    }

    public boolean isProduct_is_favourited() {
        return product_is_favourited;
    }

    public void setProduct_is_favourited(boolean product_is_favourited) {
        this.product_is_favourited = product_is_favourited;
    }

    public ProductDTO(long product_id, String product_name, float product_price, String product_imageURL, int product_count, String product_barcodeNumber, boolean product_is_favourited) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_imageURL = product_imageURL;
        this.product_count = product_count;
        this.product_barcodeNumber = product_barcodeNumber;
        this.product_is_favourited = product_is_favourited;
    }
}


