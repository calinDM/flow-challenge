package com.flowtraders.codingchallenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.flowtraders.codingchallenge.Config.ConfigBuilder;

public class Utils {

	public static Config getConfig(String configFile) {
	       ConfigBuilder builder = new ConfigBuilder();
	        
	        try {
	            List<String> configs = Files.readAllLines(Paths.get(configFile));
	            builder
	            .withSpread(Double.parseDouble(configs.get(0)))
	            .withMinsize(Integer.parseInt(configs.get(1)))
	            .withStartTime(Long.parseLong(configs.get(2)))
	            .withEndTime(Long.parseLong(configs.get(3)));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return builder.build();
	    }

	public static List<String> getOrderBookEntries(String filePath) throws IOException {
		return Files.readAllLines(Paths.get(filePath));
	}
}
