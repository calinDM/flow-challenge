package com.flowtraders.codingchallenge;

public class Config {

	private double spread;
	private int minSize;
	private long startTime;
	private long endTime;

	private Config() {
	}

	public double getSpread() {
		return spread;
	}

	public int getMinSize() {
		return minSize;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public static ConfigBuilder builder() {
		return new ConfigBuilder();
	}

	public static class ConfigBuilder {
		private Config config;

		public ConfigBuilder() {
			this.config = new Config();
		}

		public ConfigBuilder withSpread(double spread) {
			this.config.spread = spread;
			return this;
		}

		public ConfigBuilder withMinsize(int minSize) {
			this.config.minSize = minSize;
			return this;
		}

		public ConfigBuilder withStartTime(long startTime) {
			this.config.startTime = startTime;
			return this;
		}

		public ConfigBuilder withEndTime(long endTime) {
			this.config.endTime = endTime;
			return this;
		}

		public Config build() {
			return config;
		}
	}
}
