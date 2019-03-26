package com.flowtraders.codingchallenge;

import java.util.List;

public class OrderBookChecker {

    private Config config;

    public OrderBookChecker(Config config) {
        this.config = config;

    }

    /**
     * @param lines - entries in the Order Book in chronological order
     * @return - the result with the spread, size and total violations times
     */
    public Result processOrders(List<String> lines) {
        // TODO: Add your implementation here
        return null; // Return an instance of Result with your findings
    }

    public Config getConfig() {
        return config;
    }

}
