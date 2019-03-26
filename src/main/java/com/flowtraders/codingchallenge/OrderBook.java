package com.flowtraders.codingchallenge;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrderBook {
    private Map<Float, List<Order>> buyOrders = new TreeMap<>();
    private Map<Float, List<Order>> sellOrders = new TreeMap<>();

    public void reset() {
        // TODO Add your implementation here
    }

    public void addOrder(Order order) {
        // TODO Add your implementation here
    }

    public void modifyOrder(Order order) {
        // TODO Add your implementation here
    }

    public void cancelOrder(Order order) {
        // TODO Add your implementation here
    }

    public Integer getTotalSize(Side side) {
        // TODO: Add your implementation here
        return null;
    }

    public Float getSpread() {
        // TODO: Add your implementation here
        return null;
    }
}
