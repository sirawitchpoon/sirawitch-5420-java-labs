package butryojantho.sirawitch.lab11;

import butryojantho.sirawitch.lab6.MobileDevice;

public class MobileDeviceV2 extends MobileDevice {

    protected String brand, model, mobileOS, type;
    protected double weight;

    public MobileDeviceV2(String brand, String model, String color, double weight, double price, String mobileOS,
            String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mobileOS = mobileOS;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean isWatch() {
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMobileOS() {
        return mobileOS;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMobileOS(String mobileOS) {
        this.mobileOS = mobileOS;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Brand Name : " + brand
                + ", Model Name : " + model
                + ", Color : " + color
                + ", Weight : " + weight
                + ", Price : " + price
                + ", Mobile OS : " + mobileOS
                + ", Type : " + type;
    }

}
