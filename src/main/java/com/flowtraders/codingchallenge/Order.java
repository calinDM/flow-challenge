package com.flowtraders.codingchallenge;

import java.util.Objects;

public class Order {
    private int id;
    private Side side;
    private int size;
    private float price;

    public Order(int id, Side side, int size, float price) {
        this.id = id;
        this.side = side;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Side getSide() {
        return side;
    }

    public int getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
