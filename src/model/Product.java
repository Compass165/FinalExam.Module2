package model;

import java.io.Serializable;

public class Product implements Serializable {

    private String id;
    private String name;
    private int cost;
    private int amount;
    private String detail;

    public Product(){
    }

    public Product(String id, String name, int cost, int amount, String detail) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                ", detail='" + detail + '\'' +
                '}';
    }
}
