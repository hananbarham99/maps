package hanan.birzeit.comp438.example.map2.Models;

import java.io.Serializable;

public class CarModel implements Serializable {
    public String Brand;
    public String Type;
    public String Color;
    public String Price;
    public String Image;

    public CarModel(String brand, String type, String color, String price, String image) {
        Brand = brand;
        Type = type;
        Color = color;
        Price = price;
        Image = image;
    }

    public String getBrand() {
        return Brand;
    }
    public String getType() {
        return Type;
    }
    public String getColor() {
        return Color;
    }
    public String getPrice() {
        return Price;
    }
    public String getImage() {
        return Image;
    }
}
