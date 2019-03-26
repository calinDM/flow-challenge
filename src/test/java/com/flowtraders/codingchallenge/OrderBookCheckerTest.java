package com.flowtraders.codingchallenge;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;

public class OrderBookCheckerTest {

    @Test
    public void test_1() throws IOException, URISyntaxException {
        testScenario("test_1/config.txt", "test_1/orders.txt", "test_1/expected.txt");
    }

    @Test
    public void test_2() throws IOException, URISyntaxException {
        testScenario("test_2/config.txt", "test_2/orders.txt", "test_2/expected.txt");
    }

    @Test
    public void test_3() throws IOException, URISyntaxException {
        testScenario("test_3/config.txt", "test_3/orders.txt", "test_3/expected.txt");
    }

    @Test
    public void test_4() throws IOException, URISyntaxException {
        testScenario("test_4/config.txt", "test_4/orders.txt", "test_4/expected.txt");
    }

    @Test
    public void test_5() throws IOException, URISyntaxException {
        testScenario("test_5/config.txt", "test_5/orders.txt", "test_5/expected.txt");
    }

    @Test
    public void test_6() throws IOException, URISyntaxException {
        testScenario("test_6/config.txt", "test_6/orders.txt", "test_6/expected.txt");
    }

    private void testScenario(String configFile, String orderBookFile, String expectedResultFile) throws IOException, URISyntaxException {
        ClassLoader loader = getClass().getClassLoader();
        Config config = Utils.getConfig(new File(loader.getResource(configFile).getFile()).getAbsolutePath());
        List<String> entries = Utils
                .getOrderBookEntries(new File(loader.getResource(orderBookFile).getFile()).getAbsolutePath());
        Result expected = TestUtils
                .getExpectedResult(new File(loader.getResource(expectedResultFile).getFile()).getAbsolutePath());

        OrderBookChecker checker = new OrderBookChecker(config);
        Result result = checker.processOrders(entries);

        assertEquals(expected.getSizeViolation(), result.getSizeViolation());
        assertEquals(expected.getSpreadViolation(), result.getSpreadViolation());
        assertEquals(expected.getTotalViolation(), result.getTotalViolation());
    }

}
