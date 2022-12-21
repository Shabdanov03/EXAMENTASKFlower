package flowers;

import enams.Color;
import enams.Country;

import java.math.BigDecimal;

public  abstract  class Flower {
    private Country manufacturerCountry;
    private byte shelfLifeInDays;
    private Color color;
    private BigDecimal price;

    public Flower(Country manufacturerCountry, byte shelfLifeInDays, Color color, BigDecimal price) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLifeInDays = shelfLifeInDays;
        this.color = color;
        this.price = price;
    }

    public Country getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(Country manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public byte getShelfLifeInDays() {
        return shelfLifeInDays;
    }

    public void setShelfLifeInDays(byte shelfLifeInDays) {
        this.shelfLifeInDays = shelfLifeInDays;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "   \nFlower : " +
                "\nmanufacturerCountry=" + manufacturerCountry +
                "\n shelfLifeInDays=" + shelfLifeInDays +
                "\n color=" + color +
                "\n price=" + price +
                "\n~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
