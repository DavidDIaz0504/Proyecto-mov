package com.david.esteban.diaz.tienditavirtu;

public class product {
    private String name, description, url_image;
    private Double price;

    public product() {
    }

    public product(String name, String description, String url_image, Double price) {
        this.name = name;
        this.description = description;
        this.url_image = url_image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
