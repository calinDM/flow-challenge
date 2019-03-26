package com.flowtraders.codingchallenge;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrderBook {
    private Map<Float, List<Order>> buyOrders = new TreeMap<>();
    private Map<Float, List<Order>> sellOrders = new TreeMap<>();

    public Integer getTotalSize(Side side) {
        //TODO: Implement logic
        return null;
    }

    public void reset() {
        buyOrders = new TreeMap<>();
        sellOrders = new TreeMap<>();
    }

    public Float getSpread() {
       //TODO: Implement logic
        return null;
    }
}
