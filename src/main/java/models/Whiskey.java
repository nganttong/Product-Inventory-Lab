package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private int proof;
    private int bottleSize;
    private int qty;
    private float price;

    public Whiskey(int id, String name, String brand, int proof, int bottleSize, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.proof = proof;
        this.bottleSize = bottleSize;
        this.qty = qty;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProof() {
        return proof;
    }

    public void setProof(int proof) {
        this.proof = proof;
    }

    public int getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(int bottleSize) {
        this.bottleSize = bottleSize;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
