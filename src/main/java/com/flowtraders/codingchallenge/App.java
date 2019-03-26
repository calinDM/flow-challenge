package com.flowtraders.codingchallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * 
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        CommandLine cmd = parseArgs(args);
        OrderBookChecker checker = new OrderBookChecker(Utils.getConfig(cmd.getOptionValue("config")));
        Result result = checker.processOrders(Utils.getOrderBookEntries(cmd.getOptionValue("orderBook")));
        writeResult(result, cmd.getOptionValue("outputFile"));
    }

    private static void writeResult(Result result, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(result.getSpreadViolation()));
            writer.newLine();
            writer.write(String.valueOf(result.getSizeViolation()));
            writer.newLine();
            writer.write(String.valueOf(result.getTotalViolation()));
        } catch (IOException e) {
            System.err.println("Could not write to output");
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static CommandLine parseArgs(String[] args) {
        Options options = new Options();

        Option configFile = new Option("c", "config", true, "Configuration entry file path");
        configFile.setRequired(true);
        options.addOption(configFile);

        Option ordersFile = new Option("b", "orderBook", true, "Order book file path");
        ordersFile.setRequired(true);
        options.addOption(ordersFile);

        Option outputFile = new Option("o", "outputFile", true, "Results output file path");
        outputFile.setRequired(true);
        options.addOption(outputFile);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            return parser.parse(options, args);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            formatter.printHelp("code-challenge", options);
            System.exit(1);
        }
        return null;
   
    }
    
    
}
