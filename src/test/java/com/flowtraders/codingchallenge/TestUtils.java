package com.flowtraders.codingchallenge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestUtils {

	public static Result getExpectedResult(String path) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(path));
		Result expected = new Result();
		expected.setSpreadViolation(Long.parseLong(lines.get(0)));
		expected.setSizeViolation(Long.parseLong(lines.get(1)));
		expected.setTotalViolation(Long.parseLong(lines.get(2)));
		return expected;
	}

}
